package sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
   public void socClient(String address , int port) throws IOException {
      Socket socket = new Socket(address,port);
      PrintWriter printWriter = new PrintWriter(socket.getOutputStream(),true);
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      while(true){
      String readerInput =  bufferedReader.readLine();
      printWriter.println(readerInput);
      }
   }

   public static void main(String[] args) throws IOException {
      Client client=new Client();
      client.socClient("localhost",5555);
   }
}
