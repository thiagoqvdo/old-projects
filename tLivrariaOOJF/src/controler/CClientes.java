/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.util.ArrayList;
import model.cliente;

/**
 *
 * @author jairb
 */
public class CClientes {

    private ArrayList<cliente> clientes = new ArrayList<>();
    private int auxIdCliente = 1;

    public void mokClientes() {
        cliente cli = new cliente();
        cli.setIdCliente(this.criaIdCliente());
        cli.setNomeCliente("Juventino Florencio");
        cli.setCpf("123");
        cli.setCnpj("");
        cli.setEndereco("Flores da Cunha");
        cli.setTelefone("51 44334433");
        this.addCliente(cli);
        cliente cli2 = new cliente();
        cli2.setIdCliente(this.criaIdCliente());
        cli2.setNomeCliente("Josnelson das Candongas");
        cli2.setCpf("");
        cli2.setCnpj("321");
        cli2.setEndereco("Dorival de Oliveira");
        cli2.setTelefone("51 9 99998888");
        this.addCliente(cli2);
    }

    public void addCliente(cliente c) {
        this.clientes.add(c);
    }

    public ArrayList<cliente> getClientes() {
        return clientes;
    }

    public int criaIdCliente() {
        return this.auxIdCliente++;
    }

    public Boolean verificaCpf(String CpfCnpj) {
        boolean valida = false;
        for (cliente cliente : this.clientes) {
            if (cliente.getCpf().equalsIgnoreCase(CpfCnpj)) {
                valida = true;
                break;
            }
        }
        return valida;
    }

    public Boolean verificaCnpj(String CpfCnpj) {
        boolean valida = false;
        for (cliente cliente : this.clientes) {
            if (cliente.getCnpj().equalsIgnoreCase(CpfCnpj)) {
                valida = true;
                break;
            }
        }
        return valida;
    }
}
