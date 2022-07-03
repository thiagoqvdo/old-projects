/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import model.editoraVO;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import persistencia.Conexao;

/**
 *
 * @author Thiago Quevedo
 */
public class EditoraDAO {

    public void cadastrarEditora(editoraVO eVO) throws SQLException {

        Connection con = Conexao.getConexao();

        Statement stat = con.createStatement();

        try {
            String sql;

            sql = "insert into editora(ideditora, nomeEditora, endereco, telefone, gerente)"
                    + "values(null, '" + eVO.getNomeEditora() + "','" + eVO.getEndereco() + "','" + eVO.getTelefone() + "','" + eVO.getGerente() + "')";

            stat.execute(sql);
        } catch (SQLException ex) {
            throw new SQLException("Erro ao inserir a editora! " + ex.getMessage());
        } finally {

            stat.close();
            con.close();
        }
    }

    public ArrayList<editoraVO> buscaEditora() throws SQLException {

        Connection con = Conexao.getConexao();

        Statement stat = con.createStatement();

        try {
            String sql;
            sql = "select * from editora";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<editoraVO> editoras = new ArrayList();

            while (rs.next()) {

                editoraVO edi = new editoraVO();
                edi.setIdEditora(rs.getInt("ideditora"));
                edi.setNomeEditora(rs.getString("nomeEditora"));
                edi.setEndereco(rs.getString("endereco"));
                edi.setTelefone(rs.getString("telefone"));
                edi.setGerente(rs.getString("gerente"));
                editoras.add(edi);
            }

            return editoras;
        } catch (SQLException ex) {
            throw new SQLException("Erro ao buscar editoras!" + ex.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
    public void deletarEditora(int idEditora) throws SQLException {
        //Busca conexão com o banco de dados
        Connection con = Conexao.getConexao();

        //cria um objeto "stat" responsável por enviar os comandos de banco do Java para serem sexdcutados dentro do BD
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "delete from editora where ideditora = " + idEditora;
            stat.execute(sql);
        } catch (SQLException ex) {
            throw new SQLException("Erro ao deletar editora " + ex.getMessage());
        } finally {
            stat.close();
            con.close();
        }
    }
    
    public void alterarEditora(editoraVO eVO) throws SQLException{
        Connection con = Conexao.getConexao();

        Statement stat = con.createStatement();
        
        try{
            String sql;
            
            sql = "update editora set " 
                    + "nomeEditora ='" + eVO.getNomeEditora() + "',"
                    + "endereco ='" + eVO.getEndereco() + "',"
                    + "telefone ='" + eVO.getTelefone() + "',"
                    + "gerente ='" + eVO.getGerente() + "' "
                    + "where ideditora =" + eVO.getIdEditora() + "";
            
            stat.execute(sql);
        } catch (SQLException ex){
            throw new SQLException("Erro ao alterar a editora" + ex.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
}
