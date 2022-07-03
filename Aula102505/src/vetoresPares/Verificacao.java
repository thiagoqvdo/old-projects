
package vetoresPares;

/**
 *
 * @author Thiago
 */
public class Verificacao {
    public int[] numero = new int[10];
    public int maior, menor, i;
    
    public void verificaNumeros(){
        this.menor = this.numero[0];
        this.maior = 0;
        for (i = 0; i <=9; i++){
        verificaMaiorEMenor();
        
        }
    }
    
    public void mostraNumeros(){
        
            System.out.println("Maior número informado: "+ this.maior);
            System.out.println("Menor número informado: "+ this.menor);
            System.out.println("\n");
            for (i = 0; i <=9; i++){
                if (numero[i] % 2 == 0){
                    System.out.println(numero[i]+" é par!");
                }
            }
            
            
        }
    
    
    public void verificaMaiorEMenor(){
        if (this.numero[i] > this.maior){
            this.maior = this.numero[i];
        } 
        if (this.numero[i] < this.menor){
            this.menor = this.numero[i];
        }
    }
    
    
    
  
        
    
    
    
}
