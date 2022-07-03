
package oitoPosicoes;

/**
 *
 * @author Thiago
 */
public class Verificacao {
    public double[] numero = new double[8];
    public double soma, mult;
    
    
    public void principal(){
        numerosDigitados();
        soma();
        multiplica();
        
        
        
    }
    
    public void numerosDigitados(){
        System.out.println("Números digitados: ");
        for (int i = 0; i <=7; i++){ 
        System.out.println(this.numero[i]);
        }
        System.out.println("\n");
    }
    
    public void soma(){
        this.soma = 0;
        System.out.println("Soma dos números digitados: ");
        for (int i = 0; i <=7; i++){
            
            System.out.print(this.soma+" + " +this.numero[i] + " = " );
            this.soma = this.soma + this.numero[i];
            System.out.println(this.soma);
        }
        System.out.println("\n");
       
    }
    
    
    public void multiplica(){
        this.mult =1;
        System.out.println("Multiplicação dos números digitados: ");
        for (int i = 0; i <= 7; i++){
            System.out.print(this.mult+" x " +this.numero[i] + " = " );
            this.mult = this.mult * this.numero[i];
            System.out.println(this.mult);
        }
        System.out.println("\n");
    }
    
}
