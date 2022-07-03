
package primeiraAtividade2105;

/**
 *
 * @author Thiago
 */
public class Main {

    
    public static void main(String[] args) {
        fazAcontecer();
    }
    
    
    
    
    
    
    public static void fazAcontecer(){
        int soma = 0;
       for (int numero = 1; numero<=100; numero++){
           if(numero%2 != 0){
               soma= numero+soma;
               System.out.println(numero +" + "+ (soma-numero)+" = "+soma );
               
               
           }
       }
    }
    
}
