
package seMaiorQue10;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {

    public static void main(String[] args) {
        Verifica v = new Verifica ();
        Scanner ler = new Scanner (System.in);
        
        
        System.out.print("Digite um número: ");
        v.numero = ler.nextDouble();
        v.verificacao();
        
    }
    
}
