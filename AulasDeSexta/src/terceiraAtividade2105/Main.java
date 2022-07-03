
package terceiraAtividade2105;

/**
 *
 * @author Thiago
 */
public class Main {

   
    public static void main(String[] args) {
        fazAcontecer();
    }
    
    
    
    public static void fazAcontecer(){
        int impares = 0;
        int pares = 1;
        for (int numero = 1; numero <= 40; numero++){
          if (numero >= 1 && numero <= 30 && numero % 2 != 0){
              impares = impares + numero;
              System.out.println(numero +" + "+ (impares-numero)+" = "+impares );
              
          } else if (numero >= 30 && numero <= 40 && numero % 2 == 0){
              pares = pares * numero;
              System.out.println(numero +" x "+ (pares/numero)+" = "+pares );
          }
          
      }
    }
    
}
