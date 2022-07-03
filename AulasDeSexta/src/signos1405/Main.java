
package signos1405;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {

    public static void main(String[] args) {
        Signos s = new Signos ();
        Scanner ler = new Scanner (System.in);
        
        System.out.print("Digite seu dia de nascimento: ");
        s.dia = ler.nextInt();
        
        System.out.print("Digite o seu mês de nascimento: ");
        s.mes = ler.nextInt();
        
        s.verificaSignos();
    }
    
}
