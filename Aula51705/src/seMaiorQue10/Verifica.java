
package seMaiorQue10;

/**
 *
 * @author Thiago
 */
public class Verifica {
    public double numero;
    
    public void verificacao(){
        if (this.numero > 10){
            System.out.println("É maior que 10!");
        } else if (this.numero < 10){
            System.out.println("É menor que 10!");            
        } else if (this.numero == 10){
            System.out.println("Números iguais!");
        }
    }
}
