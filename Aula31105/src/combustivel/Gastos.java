
package combustivel;

/**
 *
 * @author Thiago
 */
public class Gastos {
    public float preco, kmL, km, litros;
    
    public float litros(){
        return (this.km/this.kmL);
    }
        
        
        public float valorGasto(){
            return this.litros()*this.preco;
        }
        
    
    
}
