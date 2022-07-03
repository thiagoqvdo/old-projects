
package oitoPosicoes;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {

    
    public static void main(String[] args) {
      Verificacao v = new Verificacao();
      Scanner ler = new Scanner(System.in);
      
      for (int i = 0; i <= 7; i++){
          System.out.print("Informe um número: ");
          v.numero[i] = ler.nextDouble();
          
      }
        System.out.println("\n");
      v.principal();
      
    }
    
}
