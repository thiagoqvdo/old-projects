
package vetoresPares;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {

    public static void main(String[] args) {
       Verificacao v = new Verificacao ();
       Scanner ler = new Scanner (System.in);
       
       
       
       for (int i = 0; i <= 9; i++){
           System.out.print("Informe um número: ");
           v.numero[i] = ler.nextInt();
           
          
       }
        System.out.println("\n");
       v.verificaNumeros();
       v.mostraNumeros();
    }
    
}
