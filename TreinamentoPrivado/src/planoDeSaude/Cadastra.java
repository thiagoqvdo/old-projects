
package planoDeSaude;

/**
 *
 * @author Thiago
 */
public class Cadastra {
    public long numero, cpf, cep;
    public String nome, endereco;
    
    
     public void pulaLinha (){
         System.out.println("\n");
    }
     public void divideLinha(){
         System.out.println("_____________________________________________________________________________________________________________________________________________________________________________________"); 
     }

    @Override
    public String toString() {
        return " Nome = " + nome + "\n" + "Número = " + numero + "\n" +"Cpf = " + cpf + "\n" + "Cep = " + cep + "\n" + "Endereço = " + endereco + '}';
    }
    
    
    
    
    
}
