
package exercicioMacas;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {

  
    public static void main(String[] args) {
        Verifica v = new Verifica ();
        Scanner ler = new Scanner (System.in);
        
        System.out.print("Digite a quantidade de maças que deseja comprar: ");
        v.qntd = ler.nextInt();
        
        System.out.println("O custo total da compra é de "+v.calculaValor() +"R$");
    }
    
}
