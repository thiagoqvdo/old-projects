
package triangulo;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {

    
    public static void main(String[] args) {
       Triangulo t = new Triangulo();
       Scanner ler = new Scanner (System.in);
       
        System.out.print("Digite a base do triângulo: ");
        t.altura = ler.nextDouble();
        
        System.out.print("Digite a altura do triângulo: ");
        t.base = ler.nextDouble();
        
        System.out.println("A área do triângulo é "+t.area());
    }
    
}
