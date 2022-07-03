/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioLivraria;

//import java.awt.Container;

import javax.swing.JOptionPane;

//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.WindowConstants;

/**
 *
 * @author Thiago
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        
        short op = 1;
        
        CadastraClientesELivros cad = new CadastraClientesELivros();
        do{
            op = Short.parseShort(JOptionPane.showInputDialog("   Escolha uma das opções \n" + "1- Cadastrar Cliente  2- Cadastrar Livro   "
                    + "3- Cadastrar Editora\n" + "4- Pesquisar Cliente   5- Pesquisar Livro  6- Pesquisar Editora\n" + "7- Realizar compra  "
                    + "8- Exibir compras    9-Fechar o programa\n"));
        switch (op){
            case 1:
                Cliente c = new Cliente();
                c.cnpj = null;
                c.cpf = null;
                c.nome = JOptionPane.showInputDialog("Nome:");
                do{
                String cpf;
                cpf = JOptionPane.showInputDialog("Cpf ou Cnpj:");
                switch (cpf.length()){
                    case 11: c.cpf = cpf;
                    break;
                    
                    case 14: c.cnpj = cpf;
                    break;
                    
                    default: JOptionPane.showMessageDialog(null, "Você informou um cpf ou cnpj inválido!");
                    
                }
                } while (c.cpf == null && c.cnpj == null);
                
                c.endereco = JOptionPane.showInputDialog("Endereço:");
                c.telefone = JOptionPane.showInputDialog("Telefone:");
                c.idCliente = cad.auxIdCliente;
                
                cad.cadClien.add(c);
                
                cad.auxIdCliente++;
                
            break;
            
            case 2: 
                Livro l = new Livro();
                l.nome = JOptionPane.showInputDialog("Nome:");
                l.autor = JOptionPane.showInputDialog("Autor:");
                l.assunto = JOptionPane.showInputDialog("Assunto");
                
            do {
                short auxIdEditora;
                auxIdEditora = Short.parseShort(JOptionPane.showInputDialog("Id da Editora:"));
                if (cad.verificaEditora(auxIdEditora)){
                    l.idEditora = auxIdEditora;
                } else{
                    String valida;
                    valida = JOptionPane.showInputDialog("Você inseriu uma editora inválida!\nDeseja cadastrar a editora antes?");
                    if(valida.equalsIgnoreCase("sim")){
                        op = (3);
                        break;   
                    } 
                    if(valida.equalsIgnoreCase("não")){
                        l.idEditora = 0;
                    } else {
                        JOptionPane.showMessageDialog(null, "Algo deu errado! Por favor informe uma resposta válida!");
                    }
                }
            } while(l.idEditora == 0);
           if(op == 3){
               break;
           }
            do{
                l.isbn = null;
                String isbn;
                isbn = JOptionPane.showInputDialog("ISBN:");
                if (isbn.length() == 13){
                    l.isbn = isbn;
                } else {
                    JOptionPane.showMessageDialog(null, "Você informou um ISBN inválido!");             
                }
            } while(l.isbn == null);
        
                l.valor = Double.parseDouble(JOptionPane.showInputDialog("Valor:"));
                l.quant = Short.parseShort(JOptionPane.showInputDialog("Quantidade:"));
                l.idLivro = cad.auxIdLivro;
                cad.cadLiv.add(l);
                cad.auxIdLivro++;
                
                break;
                
            case 3:
                Editora e = new Editora();
                e.nome = JOptionPane.showInputDialog("Nome:");
                e.endereco = JOptionPane.showInputDialog("Endereco:");
                e.telefone = JOptionPane.showInputDialog("Telefone:");
                e.gerente = JOptionPane.showInputDialog("Gerente:");
                e.idEditora = cad.auxIdEditora;
                cad.cadEdi.add(e);
                cad.auxIdEditora++;
                
                break;
                
            case 4:
                String cpf;
                do{
                cpf = JOptionPane.showInputDialog("Informe o cpf ou cnpj do cliente:");
                
                if(cpf.length() == 11 || cpf.length() == 14){
                    cad.pesquisaCliente(cpf);
                } else {
                    JOptionPane.showMessageDialog(null, "Você informou um cpf ou cnpj inválido!");
                    cpf = null;
                }
                    
                } while (cpf == null);
               
               break;
               
            case 5: 
                String isbn;
                isbn = JOptionPane.showInputDialog("Informe o ISBN do livro:");
                JOptionPane.showMessageDialog(null, cad.pesquisaLivro(isbn));
               
                
                break;
                
            case 6:
                String nome;
                nome = JOptionPane.showInputDialog("Informe o nome da editora:");
                JOptionPane.showMessageDialog(null, cad.pesquisaEditora(nome));
                
                break;
                
            case 7:
                CompraCliente cc = new CompraCliente();
                String comprarDnv = "Não";
                short i = -1;
                
                cc.idCliente  = Short.parseShort(JOptionPane.showInputDialog("Informe o id do cliente:"));
                cc.data =  cc.getDateTime();
                cc.idCompra = cc.criaIdCompra();
                do {
                    i++;
                    short auxIdLivro;
                    do{
                    auxIdLivro = (Short.parseShort(JOptionPane.showInputDialog("Informe o id do livro comprado:")));
                    if(cad.verificaLivro(auxIdLivro)){
                        cc.idLivro[i] = auxIdLivro;
                    } else {
                        JOptionPane.showMessageDialog(null, "Você informou um id inválido, tente novamente:");
                    }
                    } while (! cad.verificaLivro(auxIdLivro));
                    comprarDnv = JOptionPane.showInputDialog("Deseja inserir outro livro?");
                    
                } while (comprarDnv.equalsIgnoreCase("Sim"));
                cad.cadComClien.add(cc);
                
                break;
                
            case 8:
                JOptionPane.showMessageDialog(null, cad);
                
        }
        } while (op != 9);
    }
    
    
}




//        JFrame janela = new JFrame("Livraria");
//        janela.setBounds(100, 100, 600, 400);
//        Container caixa = new Container();
//        JButton botaoCadastraClien = new JButton("Cadastrar Cliente");
//        
//        
        
        
//        
//        janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//        janela.setVisible(true);