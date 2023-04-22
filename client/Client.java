package client;

import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        int porta = 54321;
        String ip = "127.0.0.1"; // localhost
        Socket socket;

        try {
            socket = new Socket(ip,porta);
            System.out.println("Conectado com o servidor.");
         } catch (Exception e) {
             System.out.println("Erro: " + e.getMessage());
             return;
         }
 
        // while(){
 
         //}
 
         try {
             System.out.println("Encerrando o cliente");
             socket.close();
         } catch (Exception e) {
             
         }
    }
}