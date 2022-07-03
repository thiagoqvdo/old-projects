
package positivoNegativo;

/**
 *
 * @author Thiago
 */
public class PositivoOuNegativo {
    public double numero;
    
    public void verifica(){
        if (numero>=0){
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }
    }
}
