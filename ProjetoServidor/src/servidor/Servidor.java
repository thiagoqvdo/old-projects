/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Thiago
 */
public class Servidor {
    public static void main(String[] args) throws IOException {
        ServerSocket servidor = new ServerSocket(8000);
        
        Socket socket = servidor.accept() ;
        
        if(socket.isConnected()){
            System.out.println("Computador " + socket.getInetAddress() + " se conectou");
        }
        if (socket.isClosed()){
            System.out.println("Computador " + socket.getInetAddress() + " se desconectou");
        }
    }
}
