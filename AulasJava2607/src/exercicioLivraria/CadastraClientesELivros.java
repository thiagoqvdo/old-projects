/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioLivraria;

import java.util.ArrayList;

/**
 *
 * @author Thiago
 */
public class CadastraClientesELivros {
    public ArrayList <Cliente> cadClien = new ArrayList<>();
    public ArrayList <Livro> cadLiv = new ArrayList<>();
    public ArrayList <Editora> cadEdi = new ArrayList<>();
    public ArrayList <CompraCliente> cadComClien = new ArrayList<>();
    
    public ArrayList <Cliente> clientePesquisado = new ArrayList<>();
    public ArrayList <Livro> livroPesquisado = new ArrayList<>();
    public ArrayList <Editora> editoraPesquisado = new ArrayList<>();
    
    short auxIdCliente = 1, auxIdEditora = 1, auxIdLivro = 1;
    
    public boolean verificaEditora (short idEditora){
        boolean verifica = false;
        for(int i=0; i<this.cadEdi.size(); i++){
            if (this.cadEdi.get(i).getIdEditora()==(idEditora)){
                verifica = true;
            }                                                                                                                                    
        }
        return verifica;
    }
    
    public boolean verificaLivro (short idLivro){
        boolean verifica = false;
        for(int i=0; i<this.cadLiv.size(); i++){
            if (this.cadLiv.get(i).getIdLivro()==(idLivro)){
                verifica = true;
            }                                                                                                                                    
        }
        return verifica;
    }
    
    public String pesquisaCliente (String x){
        this.clientePesquisado.clear();
       
        if(x.length() == 11){
            for(int i=0; i<this.cadClien.size(); i++){
                if(this.cadClien.get(i).getCpf().equalsIgnoreCase(x)){
                    this.clientePesquisado.add(this.cadClien.get(i));
                    break;
                } 
            }
        }
        if(x.length() == 14){
            for(int i=0; i<this.cadClien.size(); i++){
                if(this.cadClien.get(i).getCnpj().equalsIgnoreCase(x)){
                    this.clientePesquisado.add(this.cadClien.get(i));
                    break;
                }
            }
        }
        return "Cliente pesquisado: " + this.clientePesquisado;
    }
        
    public String pesquisaLivro (String isbn){
        this.livroPesquisado.clear();
        for(int i=0; i<this.cadLiv.size(); i++){
            if (this.cadLiv.get(i).getIsbn().equalsIgnoreCase(isbn)){
                this.livroPesquisado.add(this.cadLiv.get(i));
            }                                                                                                                                    
        }
        return "" + this.livroPesquisado;
    }
    
    public String pesquisaEditora (String nome){
        this.editoraPesquisado.clear();
        for(int i=0; i<this.cadEdi.size(); i++){
            if (this.cadEdi.get(i).getNome().equalsIgnoreCase(nome)){
                this.editoraPesquisado.add(this.cadEdi.get(i));
            }                                                                                                                                    
        }
        return "" + this.editoraPesquisado;
    }
    
    @Override
    public String toString() {
        return "CadastraClientesELivros{" + "cadComClien=" + cadComClien + '}';
    }

//    @Override
//    public String toString() {
//        return "CadastraClientesELivros{" + "cadClien=" + cadClien + '}';
//    }
    
    
    
}
