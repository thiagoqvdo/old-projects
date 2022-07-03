
package tabuadaInversa;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {


    public static void main(String[] args) {
       Tabuada t = new Tabuada ();
       Scanner ler = new Scanner (System.in);
       
        System.out.print("Informe um número: ");
        t.numero = ler.nextInt();
        
        t.calcula();
    }
    
}
