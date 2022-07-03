
package notas;

import java.text.DecimalFormat;

/**
 *
 * @author Thiago
 */
public class VerificaNotas {
    public double[] notas = new double[4];
    public double media, total;

    DecimalFormat df = new DecimalFormat("0.00");
    
    public void calculaTotal(){
        for (int i = 0; i <= 3; i++){
        this.total = this.total + this.notas[i];
     }
    }
    
    public double calculaMedia(){
        return this.total/4;
    }
    
    public void mensagemFinal(){
        for (int i = 0; i <= 3; i++){
            System.out.println("Nota "+(i+1)+" = "+ this.notas[i]);
        }
        System.out.println("Média das notas: "+ df.format(calculaMedia()));
    }
}
