/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;



/**
 *
 * @author Thiago Quevedo
 */
public class ServicesFactory {
    private static ClienteServices clienteServices = new ClienteServices();
    
    public static ClienteServices getClienteServices(){
        return clienteServices;
    }
    
    private static EditoraServices editoraServices = new EditoraServices();
    
    public static EditoraServices getEditoraServices(){
        return editoraServices;
    }
}
