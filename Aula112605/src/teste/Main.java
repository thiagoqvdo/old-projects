
package teste;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {
    public static void main(String[] args) {
        int numero;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        numero = ler.nextInt();
        
        
        switch( numero )
        {
            case 1:
                System.out.println("Você digitou '1'");
            
            case 2:
                System.out.println("Você digitou '2'");
                
            case 3:
                System.out.println("Você digitou '3'");
                
            case 4:
                System.out.println("Você digitou '4'");
                
            case 5:
                System.out.println("Você digitou '5'");
        
            default:
                System.out.println("Você não digitou um número inválido");        
            
        }
        

    }
}
