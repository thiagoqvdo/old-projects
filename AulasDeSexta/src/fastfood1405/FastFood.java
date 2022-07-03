
package fastfood1405;

/**
 *
 * @author Thiago
 */
public class FastFood {
    public int codigo, qntd, erro;
    public double total;

    public double valorFinal(){
        erro = 0;
        if (codigo == 1 && qntd > 0){
            total = qntd*0.10;
            
        } else{
            erro += 1;
        }
        if (codigo == 2 && qntd > 0){
            total = qntd*0.60;
        }else{
            erro += 1;
        }
        if (codigo == 3 && qntd > 0){
            total = qntd*2.40;
        }else{
            erro += 1;
        }
        if (codigo == 4 && qntd > 0){
            total = qntd*2.20;
        }else{
            erro += 1;
        }
        if (codigo == 5 && qntd > 0){
            total = qntd*2.10;
        } else{
            erro += 1;
        }
        if (erro!= 0){
            System.out.println("Algo deu errado!");
            System.out.println("Por favor digite código e quantidade válidos");
        }
        return total;
    }
}
