
package desafio;

/**
 *
 * @author Thiago
 */
public class Verifica {
    public int idade, faixa1, faixa2, faixa3, faixa4, faixa5;
    
    public void verificacao(){
        
            if (idade > 0 && idade <= 15){
                faixa1+=1;
            } else if (idade > 15 && idade <= 30) {
                faixa2+=1;
            } else if (idade > 30 && idade <= 45){
                faixa3+=1;
            } else if (idade > 45 && idade <= 60){
                faixa4+=1;
            } else if (idade>60){
                faixa5+=1;
            }
           
        
         
            
    }
}
