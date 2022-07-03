
package novoPacote;

/**
 *
 * @author Thiago
 */
public class Verificacao {
    public int[] numero = new int[10];
    public int maior, menor;
    
    public void verificaNumeros(){
        this.menor = this.numero[0];
        this.maior = 0;
        for (int i =0; i<=9; i++ ){
            if (this.numero[i] > this.maior){
                this.maior = this.numero[i];
            }
            if (this.numero[i] < this.menor){
                this.menor = this.numero [i];
                
            }
            
        }
    }
    
    
    public void mensagemFinal(){
        System.out.println("Maior número informado: "+ this.maior);
        System.out.println("Menor número informado: "+ this.menor);
        
    }
    
    public void mensagemPrincipal(){
        System.out.print("Informe um número: ");
    }
    
    
}
