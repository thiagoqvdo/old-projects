/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioLivraria;

/**
 *
 * @author Thiago
 */
public class Editora {
    public String nome, endereco, telefone, gerente;
    public short idEditora = 0;
    
    public short getIdEditora(){
        return this.idEditora;
    }
    
    public String getNome(){
        return this.nome;
    }

    @Override
    public String toString() {
        return "Editora{" + "nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", gerente=" + gerente + ", idEditora=" + idEditora + '}';
    }
    
    
}   
//Sobre as editoras, a livraria precisa de seu código, endereço, telefone de contato, e o nome
//de seu gerente.