
package exercicioMacas;

/**
 *
 * @author Thiago
 */
public class Verifica {
    public double total, preco;
    public int qntd;
    
    public double calculaValor(){
         if (qntd>0 && qntd<12){
          preco = 1.3;
        } else if (qntd>=12){
            preco = 1;
         } else {
             System.out.println("Quantidade inválida!");
        }
        total = preco*qntd;
        return total;
    }
}
    
    