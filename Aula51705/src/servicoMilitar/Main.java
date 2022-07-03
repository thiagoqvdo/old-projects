
package servicoMilitar;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {

  
    public static void main(String[] args) {
        Verifica v = new Verifica ();
        Scanner ler = new Scanner (System.in);
        
        
        System.out.print("Digite seu nome: ");
        v.nome = ler.nextLine();
        
        System.out.print("Digite a sua idade: ");
        v.idade = ler.nextInt();
        
        
        System.out.println("Sendo    1- Masculino       2- Feminino");
        System.out.print("Digite seu sexo: ");
        v.sexo = ler.nextInt();
        
        
        System.out.println("Sendo    1- Boa             2- Ruim");
        System.out.print("Digite como está a sua saúde: ");
        v.saude = ler.nextInt();
        
        v.verificacao();
        
    }
    
}
