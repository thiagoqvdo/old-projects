
package quadrado;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {

   
    public static void main(String[] args) {
        Quadrado quad = new Quadrado();
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Quantos cm tem o lado do quadrado?");
        quad.lado = ler.nextDouble();
        
        System.out.println("A área do quadrado em cm é "+ quad.area());
    }
    
}
