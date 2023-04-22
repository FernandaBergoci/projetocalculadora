package server;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket; //protocolo TCP/IP ele que se preocupa em como entragar a mensagem
        int porta = 54321;
        Socket socketClient;

        //processo de bind solicita porta
        try {
           serverSocket = new ServerSocket(porta); 
           System.out.println("Servidor disponível na porta: " + porta);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return;
        }

        //while(){
            try {
                System.out.println("Aguardando o cliente...");
                //programa para e aguarda a mensagem
                socketClient = serverSocket.accept();
                System.out.println("Conectado com " + socketClient.getInetAddress().getHostAddress());
            } catch (Exception e) {
                // TODO: handle exception
            }
        //}

        try {
            System.out.println("Encerrando o servidor");
            serverSocket.close();
        } catch (Exception e) {
            
        }

    }
}
