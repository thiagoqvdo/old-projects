
package exemplo;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int op;
        ListaProdutos lp = new ListaProdutos();
        
        do{
            System.out.println("---Menu---");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Mostrar produtos cadastrados");
            op = ler.nextInt();
            switch (op) {
                case 1:
                    
                    Produto p = new Produto();
                    System.out.println("Informe o nome do produto: ");
                    p.nome = ler.nextLine();
                    System.out.println("Informe a quantidade do produto: ");
                    p.quantidade = ler.nextInt();
                    System.out.println("Informe o valor do produto: ");
                    p.valor = ler.nextDouble();
                    
                    lp.adicionar(p);
                    break;
                case 2: 
                    System.out.println("Dados cadastrados: \n"+lp);
                    break;
                default:
                    System.out.println("Por gentiliza, informe uma opção válida!");
            }
            
        } while(op>0 && op<3);
        System.out.println("Programa encerrado");
    }
    
}
