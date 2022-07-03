/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioLivraria;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Thiago
 */
public class CompraCliente {
    String data;
    public short idLivro [] = new short [20], precoUni [] = new short [20];
    public double valorTotal;
    public short idCompra, idCliente;
    
    
   public String getDateTime() {
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();
	return dateFormat.format(date);
}
   public short criaIdCompra(){
       return this.idCompra++;
   }

//    @Override
//    public String toString() {
//        return "CompraCliente{" + "data=" + data + ", idLivro=" + idLivro + ", precoUni=" + precoUni + ", valorTotal=" + valorTotal + ", idCompra=" + idCompra + ", idCliente=" + idCliente + '}';
//    }
    
   
    
}
