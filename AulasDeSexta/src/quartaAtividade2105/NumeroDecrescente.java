
package quartaAtividade2105;

/**
 *
 * @author Thiago
 */
public class NumeroDecrescente {
    public int numero, vezes;
    
    public void verifica(){
        if (numero > 0){
            seNumeroForMaiorQue0();
            imprimeNumero();
        
   } 
  } 
    
    
        
    public void seNumeroForMenorQue0(){
        if (this.numero < 0){
        this.vezes--;
        }
    }
    
    public void seNumeroForMaiorQue0(){
        this.vezes++;
    }
    
    public void imprimeNumero(){
        for (this.numero = this.numero; this.numero >= 0; this.numero--){
        System.out.println(numero);
    }
    }
    public void mensagemSeDerMenorQue0(){
        System.out.println("\n");
            System.out.println("Ops! Algo deu errado, por favor informe um número inteiro maior que 0! ");
            System.out.print("Informe um número: ");
    }
}

 

