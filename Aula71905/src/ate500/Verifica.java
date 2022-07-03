
package ate500;

/**
 *
 * @author Thiago
 */
public class Verifica {
    public int numero, maior, menor, qntd, total;
     
    
    
    public void Verificacao(){
        if (numero>0){
        if (numero>maior){
            maior = numero;
        }
        if (numero<menor){
            menor = numero;
        }
        somar();
        
    } else {
            System.out.println("Ops! Algo errado, digite um número válido!");
          qntd-=1;  
        }
        
    }
        public double media(){
           return this.total/this.qntd;
        }
        public int somar(){
           return this.total= this.total+this.numero;
        }

}
