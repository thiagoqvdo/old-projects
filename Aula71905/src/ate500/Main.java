
package ate500;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {

    public static void main(String[] args) {
        Verifica v = new Verifica();
        Scanner ler = new Scanner (System.in);
        
        System.out.print("Informe um número: ");
        v.numero = ler.nextInt();
        v.menor = v.numero;
        v.somar();
        v.qntd+=1;
        v.Verificacao();
        
        for (v.qntd = 1; v.qntd <= 4; v.qntd++){
        System.out.print("Informe um número: ");
        v.numero = ler.nextInt();
        v.Verificacao();
        }
        
        System.out.println("O maior número digitado foi "+ v.maior);
        System.out.println("O menor número digitado foi "+ v.menor);
        System.out.println("A média dos números é "+v.media());
    }
}
