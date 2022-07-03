
package combustivel;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {

    
    public static void main(String[] args) {
       Gastos g = new Gastos();
       Scanner ler = new Scanner (System.in);
       
        System.out.print("Informe o preço do combustível: ");
        g.preco = ler.nextFloat();
        System.out.println("\n");
        
        System.out.print("Informe a distância que deseja percorrer: ");
        g.km = ler.nextFloat();
        System.out.println("\n");
        
        System.out.print("Informe a quantidade de Km/l seu automóvel pode fazer: ");
        g.kmL = ler.nextFloat();
        System.out.println("\n");
        
        System.out.println("A quantidade de litros necessários para percorrer a distância desejada é de "+ g.litros());
        
        System.out.print("O valor gasto será de "+ g.valorGasto());
        
        
    }
    
}
