/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.DAOFactory;
import dao.EditoraDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import model.editoraVO;

/**
 *
 * @author Thiago Quevedo
 */
public class EditoraServices {
    private static final EditoraDAO eDAO = DAOFactory.getEditoraDAO();
    public void cadastraEditora (editoraVO eVO) throws SQLException{
        eDAO.cadastrarEditora(eVO);
    }
    
    public ArrayList <editoraVO> buscarEditora() throws SQLException{
        return eDAO.buscaEditora();
    }
    
    public void deletarEditora(int idEditora) throws SQLException{
        eDAO.deletarEditora(idEditora);
    }
    public void alterarEdiotora (editoraVO eVO) throws SQLException{
        eDAO.alterarEditora(eVO);
    }
}
