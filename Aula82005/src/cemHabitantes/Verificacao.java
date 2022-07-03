
package cemHabitantes;

/**
 *
 * @author Thiago
 */
public class Verificacao {
    public int idade, menor, maior, mulheres, numero;
    public String sexo;
    public double salario, total;
    
    public void verifica(){
        if (this.idade>0 && this.salario>0  && (this.sexo.equalsIgnoreCase("f") || (this.sexo.equalsIgnoreCase("m")) || (this.sexo.equalsIgnoreCase("feminino")) || (this.sexo.equalsIgnoreCase("masculino")))){
        if (this.idade<this.menor){
            this.menor = this.idade;
        } 
        if (this.idade>this.maior){
            this.maior = this.idade;
        }
        total();
        if (this.salario<=100 && (this.sexo.equalsIgnoreCase("f") || (this.sexo.equalsIgnoreCase("feminino")))){
        mulheres();
        }
        } else {
            System.out.println("Ops! Algo deu errado, digite dados válidos!");
            this.numero-=1;
        }
    }
    public double total(){
        return this.total= this.total+this.salario;
    }
    public int mulheres(){
        return this.mulheres+=1;
        
    }
    public double media(){
        return this.total/this.numero;
    }
}
