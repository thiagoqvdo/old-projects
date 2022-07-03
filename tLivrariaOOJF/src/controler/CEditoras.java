/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.util.ArrayList;
import model.editora;

/**
 *
 * @author jairb
 */
public class CEditoras {

    private ArrayList<editora> editora = new ArrayList<>();
    private int auxIdEditora = 1;

    public void mokEditoras() {
        editora edt = new editora();
        edt.setIdEditora(this.criaIdEditora());
        edt.setNomeEditora("Senac");
        edt.setEndereco("Venancio Aires");
        edt.setTelefone("51 44223322");
        edt.setGerente("Visotto");
        this.addEditora(edt);
        editora edt2 = new editora();
        edt2.setIdEditora(this.criaIdEditora());
        edt2.setNomeEditora("Abril");
        edt2.setEndereco("São Paulo");
        edt2.setTelefone("11 33443344");
        edt2.setGerente("Abreu");
        this.addEditora(edt2);
    }

    public int criaIdEditora() {
        return this.auxIdEditora++;
    }

    public void addEditora(editora e) {
        this.editora.add(e);
    }

    public ArrayList<editora> getEditoras() {
        return editora;
    }

    public int getAuxIdEditora() {
        return auxIdEditora;
    }

    public void setAuxIdEditora(int auxIdEditora) {
        this.auxIdEditora = auxIdEditora;
    }
    
    

    public Boolean verficaEditora(int idEditora) {
        Boolean verEditora = false;
        for (editora edt : editora) {
            if (edt.getIdEditora() == idEditora) {
                verEditora = true;
                System.out.println("Editora: " + edt.getNomeEditora());
            }
        }
        return verEditora;
    }
    
    public int addEditoraCB(String nome){
        int idEditora = 0;
        for(editora e : this.getEditoras()){
           if(e.getNomeEditora().equalsIgnoreCase(nome)){
               idEditora = e.getIdEditora();
           }
    }
        return idEditora;
    }
    
    public String pesqNomeEditora(int id){
        String nome = "";
        for(editora e : this.getEditoras()){
            if(e.getIdEditora() == id){
                nome = e.getNomeEditora();
            }
        }
        return nome;
    }
}
    
    
