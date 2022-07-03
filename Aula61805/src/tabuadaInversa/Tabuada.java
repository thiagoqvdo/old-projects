
package tabuadaInversa;

/**
 *
 * @author Thiago
 */
public class Tabuada {
    int numero, result;
    public void calcula(){
        for (int mult = 50; mult>=1; mult--){
            result = numero*mult;
            System.out.println(numero+"x"+mult+"="+result);
        }
    }
}
