
package notasAlunos;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {

   
    public static void main(String[] args) {
      NotasAlunos na = new NotasAlunos();
      Scanner ler = new Scanner (System.in);
      
        System.out.print("Digite a primeira nota: ");
        na.n1 = ler.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        na.n2 = ler.nextDouble();
        
        System.out.print("Digite a terceira nota:");
        na.n3 = ler.nextDouble();
                
        na.verificarConceito();
    }
    
}
