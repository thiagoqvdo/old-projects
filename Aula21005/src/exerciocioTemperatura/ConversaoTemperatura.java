/*
 Escreva um algoritmo para ler uma temperatura em graus Celsius. Calcular e 
escrever o valor correspondente em graus Fahrenhet. 

F = ( 9 * C + 160 ) / 5
 */
package exerciocioTemperatura;

/**
 *
 * @author Thiago
 */
public class ConversaoTemperatura {
   public double celsius;
   
   public double converterTemperatura(){
       return (9 * this.celsius + 160)/5;
   }
}
