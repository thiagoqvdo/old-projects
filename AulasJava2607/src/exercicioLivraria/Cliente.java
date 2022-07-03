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
public class Cliente {
    public String nome, endereco, telefone, cpf, cnpj;
    public short idCliente = 0;
 
    
    public String getCpf(){
        return cpf;
    }
    
    public String getCnpj(){
        return cnpj;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", cpf=" + cpf + ", cnpj=" + cnpj + ", idCliente=" + idCliente + '}';
    }

    
    
}
//endereço, telefone, CPF e lista dos livros que;
//este cliente já comprou. Para cada compra, é importante guardar a data em que esta foi
//realizada