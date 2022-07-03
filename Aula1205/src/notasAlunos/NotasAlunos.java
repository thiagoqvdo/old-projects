
package notasAlunos;

/**
 *
 * @author Thiago
 */
public class NotasAlunos {
    public double n1, n2, n3;
    
    public double calculaMedia(){
    return (n1+n2+n3)/3;
    }
    public void verificarConceito(){
        if (calculaMedia()>= 0 && (calculaMedia()<=4.9)){
            System.out.println("Conceito D");
        } else if
            (calculaMedia()>=5 && calculaMedia()<=6.9){
            System.out.println("Conceito C");
        } else if
             (calculaMedia()>=7 && calculaMedia()<=8.9){
            System.out.println("Conceito B");
        } else if
                (calculaMedia()>= 9 && calculaMedia()<=10){
            System.out.println("Conceito A");
        } else {
            System.out.println("Algo deu errado!");
        System.out.println("Digite uma nota válida");
        }
        }
        
}
