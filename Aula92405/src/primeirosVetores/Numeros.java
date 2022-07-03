
package primeirosVetores;

/**
 *
 * @author Thiago
 */
public class Numeros {
    public double[] numeros = new double[10];
    
    public void mostraNumeros(){
        for (int i = 9; i >= 0; i --){
            System.out.println(this.numeros[i]);
            
        }
    }
}
