
package votacao1405;

/**
 *
 * @author Thiago
 */
public class Verificacao {
    public int anoAtual, anoNascimento;
    
    public void verifica(){
        if ((anoAtual-anoNascimento) >=16 ) {
            System.out.println("Você já pode votar!");
        } else{
            System.out.println("Você ainda não pode votar!");
        }
    }
}