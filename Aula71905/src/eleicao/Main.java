
package eleicao;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {

    
    public static void main(String[] args) {
        Verifica v = new Verifica();
        Scanner ler = new Scanner (System.in);
        
        for (v.numero = 1; v.numero <=100; v.numero++){
            
        System.out.println("Digite em quem você deseja votar:     1- Zé das couves       2- Mane do Pilão      3- Popó dos pobres");
        v.voto = ler.nextLine();
        v.verificacao();
        
            System.out.println("\n");
        
    }
        v.vencedor();
    }
}
