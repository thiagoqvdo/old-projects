
package paresImpares;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {

    
    public static void main(String[] args) {
        ParesOuImpares pi = new ParesOuImpares();
        Scanner ler = new Scanner (System.in);
        
        System.out.print("Digite um número: ");
        pi.numero = ler.nextInt();
        
        pi.verifica();
    }
    
}
