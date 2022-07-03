
package atividade1;

import java.util.ArrayList;

/**
 *
 * @author Thiago
 */
public class CaesCadastrados {
    public ArrayList <Cadastro> cadCaes = new ArrayList<>();
    
    
    public void cadastrar(Cadastro cc){
        this.cadCaes.add(cc);
    }

    @Override
    public String toString() {
        return "" + cadCaes;
    }
    
    
    
    
}
