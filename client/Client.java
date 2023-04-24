package client;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

import util.MsqReq;
import util.MsqResp;
import util.Status;

public class Client {

    public static void main(String[] args) {
        int porta = 54321;
        String ip = "127.0.0.1"; // localhost
        Socket socket;
        ObjectOutputStream out;
        ObjectInputStream in;
        Scanner entrada = new Scanner(System.in);

        try {
            socket = new Socket(ip,porta);
            System.out.println("Conectado com o servidor.");
         } catch (Exception e) {
             System.out.println("Erro: " + e.getMessage());
             return;
         }
 
         try {
            MsqReq request = new MsqReq('+', 5.0, 4.0 );
            out = new ObjectOutputStream(socket.getOutputStream());
            in = new ObjectInputStream(socket.getInputStream());

            //System.out.println("Digite ENTER para enviar.");
            //entrada.nextLine();

            out.writeObject(request);

            MsqResp response = (MsqResp) in.readObject();
            if(response.getStatus()== Status.SUCESSO){
                System.out.println("Resposta: " + response.getValue());
            }

         } catch (Exception e) {
           System.out.println("Erro na comunicação: " + e.getMessage());
         }
 
         try {
             System.out.println("Encerrando o cliente");
             entrada.close();
             socket.close();
         } catch (Exception e) {
             
         }
    }
}