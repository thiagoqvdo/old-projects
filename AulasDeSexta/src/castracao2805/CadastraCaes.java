
package castracao2805;

import java.util.ArrayList;

/**
 *
 * @author Thiago
 */
public class CadastraCaes {
    public ArrayList <Cadastrados> listaCadastrados = new ArrayList<>();
    public ArrayList <Cadastrados> verificaPorte = new ArrayList<>();
    
    public void cadastra(Cadastrados c1){
        this.listaCadastrados.add(c1);
    }
 
    public String pesquisaPorte (String porte){
        this.verificaPorte.clear();
        Cadastrados c = new Cadastrados();
        for(int i=0; i<this.listaCadastrados.size(); i++){
            if (this.listaCadastrados.get(i).getPorte().equalsIgnoreCase(porte)){
                this.verificaPorte.add(this.listaCadastrados.get(i));
            }                                                                                                                                    
        }
        return "Cães cadastrados com o porte informado: " + this.verificaPorte;
    }

    @Override
    public String toString() {
        return "" + listaCadastrados + '}';
    }

    
    
    
    
    
}
