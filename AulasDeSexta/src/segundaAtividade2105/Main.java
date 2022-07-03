
package segundaAtividade2105;

/**
 *
 * @author Thiago
 */
public class Main {

   
    public static void main(String[] args) {
        fazAcontecer();
    }
    
    
    
    
    
    
    
    
    public static void fazAcontecer(){
        int soma =0;
       for (int numero = 100; numero <=200; numero++ ){
           if (numero % 2 == 0){
               soma = soma + numero;
               System.out.println(numero +" + "+ (soma-numero)+" = "+soma );
           }
       }
       System.out.println(soma);
    }
}
    

