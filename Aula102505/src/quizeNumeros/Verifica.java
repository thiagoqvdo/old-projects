
package quizeNumeros;

/**
 *
 * @author Thiago
 */
public class Verifica {
    public double[] numero = new double[15];
    public double numeroFalso;
    
    public void mostraNumeros(){
        for (int i = 14; i >=0; i--){
            if (numero[i] != 0){
            System.out.println(this.numero[i]);
            }
        }
    }
    
}
