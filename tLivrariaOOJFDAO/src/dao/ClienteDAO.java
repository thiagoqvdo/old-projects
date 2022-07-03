/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.clienteVO;
import persistencia.Conexao;

/**
 *
 * @author Thiago Quevedo
 */
public class ClienteDAO {

    public void cadastrarCliente(clienteVO pVO) throws SQLException {

        //Busca conexão com o banco de dados
        Connection con = Conexao.getConexao();

        //cria um objeto "stat" responsável por enviar os comandos de banco do Java para serem sexdcutados dentro do BD
        Statement stat = con.createStatement();

        try {

            String sql;//String que receberá o comando SQL

            sql = "insert into cliente(idcliente, nome, enderecoCompleto, telefone, cpf, cnpj)"
                    + "values(null,'" + pVO.getNomeCliente() + "','" + pVO.getEndereco() + "','" + pVO.getTelefone() + "'," + pVO.getCpf() + "," + pVO.getCnpj() + ")";

            //executa o comando que guardamos dentro da String sql
            stat.execute(sql);

        } catch (SQLException ex) {

            throw new SQLException("Erro ao inserir o cliente! " + ex.getMessage());

        } finally {

            stat.close();
            con.close();

        }
    }

    public ArrayList<clienteVO> buscaCliente() throws SQLException {

        //Busca conexão com o banco de dados
        Connection con = Conexao.getConexao();

        //cria um objeto "stat" responsável por enviar os comandos de banco do Java para serem sexdcutados dentro do BD
        Statement stat = con.createStatement();

        try {
            String sql;
            sql = "select * from cliente";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<clienteVO> clientes = new ArrayList<>();

            while (rs.next()) {

                clienteVO cli = new clienteVO();
                cli.setIdCliente(rs.getInt("idcliente"));
                cli.setNomeCliente(rs.getString("nome"));
                cli.setEndereco(rs.getString("enderecoCompleto"));
                cli.setTelefone(rs.getString("telefone"));
                cli.setCpf(rs.getString("cpf"));
                cli.setCnpj(rs.getString("cnpj"));
              
                clientes.add(cli);
                

            }

            return clientes;
        } catch (SQLException ex) {
            throw new SQLException("Erro ao buscar clientes!" + ex.getMessage());
        } finally {
            con.close();
            stat.close();
        }

    }

    public void deletarCliente(int idCliente) throws SQLException {
        //Busca conexão com o banco de dados
        Connection con = Conexao.getConexao();

        //cria um objeto "stat" responsável por enviar os comandos de banco do Java para serem sexdcutados dentro do BD
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "delete from cliente where idcliente = " + idCliente;
            stat.execute(sql);
        } catch (SQLException ex) {
            throw new SQLException("Erro ao deletar cliente " + ex.getMessage());
        } finally {
            stat.close();
            con.close();
        }
    }

    public boolean verificaCpfCliente(String cpf) throws SQLException {
        boolean valida = false;

        ArrayList<clienteVO> clientes = this.buscaCliente();
        for (clienteVO cliente : clientes) {
            if (cpf.equals(cliente.getCpf())) {
                valida = true;
            } else {
                valida = false;
            }
        }
        return valida;
    }

    public boolean verificaCnpjCliente(String cnpj) throws SQLException {
        boolean valida = false;

        ArrayList<clienteVO> clientes = this.buscaCliente();
        for (clienteVO cliente : clientes) {
            if (cnpj.equals(cliente.getCnpj())) {
                valida = true;
            } else {
                valida = false;
            }
        }
        return valida;
    }

    public void alterarCliente(clienteVO cVO) throws SQLException {
        Connection con = Conexao.getConexao();

        Statement stat = con.createStatement();

        try {
            String sql;

            sql = "update cliente set "
                    + "nome ='" + cVO.getNomeCliente() + "',"
                    + "enderecoCompleto ='" + cVO.getEndereco() + "',"
                    + "telefone ='" + cVO.getTelefone() + "',"
                    + "cpf ='" + cVO.getCpf() + "' "
                    + "cnpj ='" + cVO.getCnpj() + "' "
                    + "where ideditora =" + cVO.getIdCliente() + "";

            stat.execute(sql);
        } catch (SQLException ex) {
            throw new SQLException("Erro ao alterar o cliente" + ex.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
}
