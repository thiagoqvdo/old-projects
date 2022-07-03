/*
 
 */
package exercicioRetangulo;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {

    
    public static void main(String[] args) {
    Retangulo r = new Retangulo();
    Scanner ler = new Scanner(System.in);
    
        System.out.print("Informe a base do retângulo:");
        r.base = ler.nextDouble();
        
        System.out.print("Infome a altura do retângulo:");
        r.altura = ler.nextDouble();
        
        System.out.println("A área do retângulo é "+ r.area());
        
    }
    
}
