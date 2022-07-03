
package desafio;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {

    
    public static void main(String[] args) {
        Verifica v = new Verifica ();
        Scanner ler = new Scanner (System.in);
        
        for (int pessoas = 1; pessoas <=15; pessoas++){
            System.out.print("Digite a sua idade: ");
        v.idade = ler.nextInt();
        v.verificacao();
        }
        System.out.println("A quantidade de pessoas na 1ª faixa etária é de "+ v.faixa1);
            System.out.println("A quantidade de pessoas na 2ª faixa etária é de "+ v.faixa2);
            System.out.println("A quantidade de pessoas na 3ª faixa etária é de "+ v.faixa3);
            System.out.println("A quantidade de pessoas na 4ª faixa etária é de "+ v.faixa4);
            System.out.println("A quantidade de pessoas na 5ª faixa etária é de "+ v.faixa5);
        
        
    }
    
}
