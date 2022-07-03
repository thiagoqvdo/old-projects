
package exemplo;

import java.util.ArrayList;

/**
 *
 * @author Thiago
 */
public class ListaProdutos {
    public ArrayList <Produto> listaProd = new ArrayList<>();
            
    public void adicionar (Produto p1){
        this.listaProd.add(p1);
    }

    @Override
    public String toString() {
        return "ListaProdutos{" + "listaProd=" + listaProd + '}';
    }
            
}
