
package paresImpares;

/**
 *
 * @author Thiago
 */
public class ParesOuImpares {
    public int pares, impares, numero;
    
    
    public void verifica(){
        if (this.numero % 2 ==0){
            System.out.println("Número é par!");
        } else{
            System.out.println("Número é impar!");
        }
    }
}
