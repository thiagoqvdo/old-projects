
package votacao1405;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {

  
    public static void main(String[] args) {
        Verificacao v = new Verificacao();
        Scanner ler = new Scanner (System.in); 
        
        System.out.print("Digite o ano atual: ");
        v.anoAtual = ler.nextInt();
        System.out.print("Digite o seu ano de nascimento: ");
        v.anoNascimento = ler.nextInt();
        v.verifica();
    }
    
}
