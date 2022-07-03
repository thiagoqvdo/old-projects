
package variaveisTrocadas;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {

    
    public static void main(String[] args) {
        Trocar t = new Trocar ();
        Scanner ler = new Scanner(System.in);
        
        
        System.out.print("Digite o primeiro número: ");
        t.a = ler.nextInt();
        
        System.out.print("Digite o segundo número: ");
        t.b = ler.nextInt();
        
        t.troca1();
        t.troca2();
        t.troca3();
        
        System.out.println("Número a: "+ t.a);
        System.out.println("Número b: "+ t.b);
    }
    
}
