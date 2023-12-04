package writ1co2system;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    private ServerSocket serverSocket;
    private final int MAX_CONNECTIONS = 4;
    private int currentConnections = 0;

    public MyServer() {
        try {
            serverSocket = new ServerSocket(5000); // Replace with your desired port number
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void startServer() {
        //create an infinite loop so we an check for new connections
        while (true) {
            try {
                //create and accept a new socket connection
                Socket socket = serverSocket.accept();
                //is there enough space to allow the connection
                if (currentConnections < MAX_CONNECTIONS) {
                    currentConnections++;
                    System.out.println("new connection.");
                } 
                //do this is there is already a max of 4 connections
                else 
                {
                    System.out.println("Max connections reached. Connection rejected.");
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //external method for checking the current status of the server
    public synchronized boolean hasSpaceForConnection() {
        return currentConnections < MAX_CONNECTIONS;
    }
    
}