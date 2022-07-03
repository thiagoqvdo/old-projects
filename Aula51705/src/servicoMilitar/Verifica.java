
package servicoMilitar;

/**
 *
 * @author Thiago
 */
public class Verifica {
    public int sexo, idade, saude;
    public String nome;
    
    public void verificacao(){
        if (sexo == 1 && saude == 1 && idade >= 18){
            System.out.println("Senhor "+ nome + ", infelizmente você está apto a cumprir os serviços militares obrigatórios!");
        } else if (sexo == 2){
            System.out.println("Senhora "+ nome+ ", felizmente você não está apto a cumprir os serviços militares obrigatórios!");
        } else if ((sexo == 1 && saude == 2)|| (sexo == 1 && idade<18)){
            System.out.println("Senhor "+ nome + ", felizmente você não está apto a cumprir os serviços militares obrigatórios");
    } else {
            System.out.println("Ops! Algo deu errado, por favor digite dados válidos!");
        }
    }
}
