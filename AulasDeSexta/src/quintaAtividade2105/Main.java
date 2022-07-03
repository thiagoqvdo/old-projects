
package quintaAtividade2105;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {

   
    public static void main(String[] args) {
       Verificacao v = new Verificacao ();
       Scanner ler = new Scanner (System.in);
       v.total = 0;
        v.numero = 1;
       
        System.out.print("Informe sua altura: ");
        v.altura = ler.nextDouble();
        v.menor = v.altura;
        v.maior = 0;
        
        System.out.println("Informe seu sexo:      1- Masculino       2- Feminino");
        v.sexo = ler.nextLine();
        v.sexo = ler.nextLine();
        
        System.out.println("\n");
        v.verifica();
        
       
        while (v.numero<=14){
            System.out.print("Informe sua altura: ");
        v.altura = ler.nextDouble();
        
        
        System.out.println("Informe seu sexo:      1- Masculino       2- Feminino");
        v.sexo = ler.nextLine();
        v.sexo = ler.nextLine();
        System.out.println("\n");
        v.verifica();
        v.numero++;
        }
        v.mensagemFinal();
    }
    
}
