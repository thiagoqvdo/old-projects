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
public class Livro {
    public String nome, autor, assunto, isbn;
    public short idLivro = 0, quant, idEditora = 0;
    public double valor;
    
    public String getIsbn(){
        return this.isbn;
    }
    
    public short getIdLivro(){
        return this.idLivro;
    }

    @Override
    public String toString() {
        return "Livro{" + "nome=" + nome + ", autor=" + autor + ", assunto=" + assunto + ", isbn=" + isbn + ", idLivro=" + idLivro + ", quant=" + quant + ", idEditora=" + idEditora + ", valor=" + valor + '}';
    }
    
    
  
}


//Deve-se manter um cadastro sobre cada livro na livraria. Para cada livro, é importante
//armazenar o nome do autor, assunto, editora, ISBN e a quantidade dos livros em estoque. 9.