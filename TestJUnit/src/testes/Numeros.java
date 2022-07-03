/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

/**
 *
 * @author Thiago Quevedo
 */
public class Numeros {
    
    public Boolean numeroPar (int n){
        return n % 2 == 0;
    }
    
    public int areQ (int lado) {
        return lado * lado;
    }
    
    public Boolean numeroDivisivel (int dividendo, int divisor){
        return dividendo % divisor == 0;
    }
    
    public int somaValores  (int n1, int n2){
        return n1+n2;
    }
}
