
package notas;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {

   
    public static void main(String[] args) {
      VerificaNotas vn = new VerificaNotas ();
      Scanner ler = new Scanner (System.in);
      
      for (int i = 0; i <=3; i ++){
          System.out.print("Informe uma nota: ");
          vn.notas[i] = ler.nextDouble();
          
      }
      vn.calculaTotal();
      vn.mensagemFinal();
      
    }
    
}
