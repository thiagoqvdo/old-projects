
package fastfood1405;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {

 
    public static void main(String[] args) {
      FastFood ft = new FastFood ();
      Scanner ler = new Scanner (System.in);
      
      
        System.out.print("Digite o código do produto desejado: ");
        ft.codigo = ler.nextInt();
        
        System.out.print("Digite a quantidade desejada do produto: ");
        ft.qntd = ler.nextInt();
        
        System.out.println("O total da compra é de "+ft.valorFinal()+ "R$");
        
        
    }
    
}
