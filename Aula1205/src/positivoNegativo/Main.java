
package positivoNegativo;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {


    public static void main(String[] args) {
        PositivoOuNegativo pn = new PositivoOuNegativo ();
        Scanner ler = new Scanner (System.in);
        
        System.out.print("Digite um número: ");
        pn.numero = ler.nextDouble();
        
        pn.verifica();
    }
    
}
