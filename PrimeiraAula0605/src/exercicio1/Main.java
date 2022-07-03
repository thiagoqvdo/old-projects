
package exercicio1;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {


    public static void main(String[] args) {
/*
    método responsável por executar o progrma.
    Sem ele não há a possibilidade de executar a classe antecessor.
    */

        Antecessor ant = new Antecessor ();
        Scanner ler = new Scanner (System.in);
        System.out.println("Informe um número:");
        ant.numero = ler.nextInt();
        
        System.out.println("O antecessor é "+ant.retornarAntecessor());
    }
    
}
