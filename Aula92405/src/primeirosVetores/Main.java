
package primeirosVetores;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {

    
    public static void main(String[] args) {
      Numeros n = new Numeros ();
      Scanner ler = new Scanner (System.in);
      
      for (int i = 0; i <= 9; i++){
          System.out.print("Informe um número: ");
          n.numeros[i] = ler.nextDouble();
          
      }
        n.mostraNumeros();
    }
    
    
}
