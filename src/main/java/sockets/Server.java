package sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public  void runServer(int port) throws IOException {
        ServerSocket serverSocket=new ServerSocket(port);
        System.out.println("server start");
        while(true){
            Socket socket = serverSocket.accept();
            new ServerThread(socket).start();
        }
    }

    public static void main(String[] args) throws IOException {
        Server server = new Server();
       server.runServer(5555);
    }
}
