
package quartaAtividade2105;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {

    public static void main(String[] args) {
       NumeroDecrescente nd = new NumeroDecrescente();
       Scanner ler = new Scanner (System.in);
       nd.vezes = 0;
       
        System.out.print("Informe um número: ");
        nd.numero = ler.nextInt();
        if (nd.numero > 0){
        nd.verifica();
        } else {
            nd.seNumeroForMenorQue0();
        }
        while (nd.vezes < 0) {
        nd.mensagemSeDerMenorQue0();
        nd.numero = ler.nextInt();
        nd.verifica();
        }
        }
        
    }
    

