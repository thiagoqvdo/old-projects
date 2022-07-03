
package novoPacote;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {

   
    public static void main(String[] args) {
     Verificacao v = new Verificacao();
     Scanner ler = new Scanner (System.in);
     
        for (int i = 0; i <= 9; i++){
            v.mensagemPrincipal();
            v.numero[i] = ler.nextInt();
            if (v.numero[i] % 2 == 0){
                System.out.println("Número é par!");
            }
            System.out.println("\n");
        }
        v.verificaNumeros();
        v.mensagemFinal();
    }
    
}
