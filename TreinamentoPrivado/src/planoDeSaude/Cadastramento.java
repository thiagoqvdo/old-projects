
package planoDeSaude;

import java.util.ArrayList;

/**
 *
 * @author Thiago
 */
public class Cadastramento {
    public ArrayList <Cadastra> listaDeCadastrados = new ArrayList<>();


   public void fazCadastro (Cadastra c1){
       this.listaDeCadastrados.add(c1);
   }
   
   public Cadastra pacientePesquisado (long c){
        Cadastra c1 = null;
       for (int i = 0; i<= listaDeCadastrados.size() && c1 == null; i++){
           if (this.listaDeCadastrados.get(i).cpf == c){
                c1 =(this.listaDeCadastrados.get(i)); 
           } 
       }
       return c1;
   }
   
   
   
   
   

    @Override
    public String toString() {
        Cadastra c = new Cadastra();
        return "Lista de pacientes:" + "\n" + listaDeCadastrados + '}';
    }


    
    
}
