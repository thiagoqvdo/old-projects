<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<?php
$pfs = $_REQUEST['listaPessoasF'];
$pfsBd = $_REQUEST['pessoasPFBD'];
?>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <table>
            <tr>
                <th>Nome</th><th>E-mail</th><th>CPF</th>
            </tr><!--
            <?php foreach ($pfs as $pf): ?>
                    <tr>
                        <td><?php //echo $pf->getNome();   ?> </td>
                        <td><?php //echo $pf->getEmail();   ?> </td>
                        <td><?php //echo $pf->getCpf();   ?> </td>
                    </tr>
            <?php endforeach; ?>-->
            <!-- Nova tabela a partir do BD -->
            <?php
            if ($pfsBd == null) {
                echo "Tabela vazia!";
            } else {
                foreach ($pfsBd as $pf):
                    ?>
                    <tr>
                        <td><?php echo $pf["nome"]; ?> </td>
                        <td><?php echo $pf["email"]; ?> </td>
                        <td><?php echo $pf["cpf"]; ?> </td>
                    </tr>
                    <?php
                endforeach;
            }
            ?>

        </table>
    </body>
</html>
