
package quintaAtividade2105;

import java.text.DecimalFormat;

/**
 *
 * @author Thiago
 */
public class Verificacao {
    public int homens, numero;
    public double altura, maior, menor, total, alturaMulheres, qntdM;
    public String sexo, sexoAltura;
    
    public void verifica(){
        if (this.altura > 0 && (this.sexo.equalsIgnoreCase("f") || (this.sexo.equalsIgnoreCase("feminino")) || (this.sexo.equalsIgnoreCase("2") || (this.sexo.equalsIgnoreCase("m") || (this.sexo.equalsIgnoreCase("masculino")) || (this.sexo.equalsIgnoreCase("1")))))){
        seMenor();
        seMaior();
        mulheresEHomens();
         } else {
           seDadosForemInvalidos();
        }
    }
    
    
    DecimalFormat df = new DecimalFormat("0.00");
    
    
    
    public double mulheres(){
            return this.total/this.qntdM;
        }
    
    
    public void seMenor(){
        if (this.altura < this.menor){
            this.menor = this.altura;
        }
    }
    
    
    public void seMaior(){
        if (this.altura > this.maior){
            if (this.sexo.equalsIgnoreCase("f") || (this.sexo.equalsIgnoreCase("feminino")) || (this.sexo.equalsIgnoreCase("2"))){
                this.sexoAltura=("feminino");
            } else if (this.sexo.equalsIgnoreCase("m") || (this.sexo.equalsIgnoreCase("masculino")) || (this.sexo.equalsIgnoreCase("1"))){
                this.sexoAltura=("masculino");
            }
            this.maior = this.altura;
        }
    }
    
    
    
    public void mulheresEHomens(){
        if (this.sexo.equalsIgnoreCase("m") || (this.sexo.equalsIgnoreCase("masculino")) || (this.sexo.equalsIgnoreCase("1"))){
            homens+=1;
        } else if (this.sexo.equalsIgnoreCase("f") || (this.sexo.equalsIgnoreCase("feminino")) || (this.sexo.equalsIgnoreCase("2"))){
            this.total = this.total + this.altura;
            this.qntdM+=1;
        }
    }
    
    
    
    public void mensagemFinal(){
        System.out.println("A maior altura do grupo é "+ this.maior);
        System.out.println("A menor altura do grupo é "+ this.menor);
        System.out.println("A média de altura das mulheres é "+ df.format(this.mulheres()));
        System.out.println("O número de homens é "+ this.homens);
        System.out.println("O sexo da pessoa mais alta é "+ this.sexoAltura);
    }
    
  
    
    public int seDadosForemInvalidos(){
        System.out.println("Ops! Algo deu errado, por favor informe dados válidos!");
        return this.numero--;
    }
    
}
