/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.DAOFactory;
import model.clienteVO;
import dao.ClienteDAO;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author Thiago Quevedo
 */
public class ClienteServices {
    private static ClienteDAO cDAO = DAOFactory.getClienteDAO();
    public void cadastraCliente(clienteVO cVO) throws SQLException{
        cDAO.cadastrarCliente(cVO);
    }
    public ArrayList<clienteVO> buscarClientes() throws SQLException{
        return cDAO.buscaCliente();
    }
    public void deletarCliente(int idCliente) throws SQLException{
        cDAO.deletarCliente(idCliente);
    }
    public void alterarCliente (clienteVO cVO) throws SQLException{
        cDAO.alterarCliente(cVO);
    }
    public boolean verificaCpfCliente(String cpf) throws SQLException{
        return cDAO.verificaCpfCliente(cpf);
    }
    public boolean verificaCnpjCliente(String cnpj) throws SQLException{
        return cDAO.verificaCnpjCliente(cnpj);
    }
}
