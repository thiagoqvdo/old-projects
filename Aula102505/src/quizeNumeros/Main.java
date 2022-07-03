
package quizeNumeros;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {

   
    public static void main(String[] args) {
        Verifica v = new Verifica();
        Scanner ler = new Scanner (System.in);
        
        
        for (int i = 0; i <=14; i++){
            System.out.print("Informe um número: ");
            v.numeroFalso = ler.nextDouble();
            if (v.numeroFalso % 2 != 0){
                v.numero[i] = v.numeroFalso;
            }
            
        }
        v.mostraNumeros();
    }
    
}
