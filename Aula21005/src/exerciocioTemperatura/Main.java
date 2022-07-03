
package exerciocioTemperatura;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {

    
    public static void main(String[] args) {
       ConversaoTemperatura ct = new ConversaoTemperatura();
       Scanner ler = new Scanner (System.in);
        
       System.out.println("Informe a temperatura em graus Celsius: ");
        ct.celsius = ler.nextDouble();
        System.out.println("Conversão da temperatura em Fahrenhet: "+ ct.converterTemperatura());
        
    }
    
}
