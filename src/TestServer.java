// A simple server to test web access



import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class TestServer {

public static void main(String[] args) {
    	
    	ServerSocket serverSocket = null;
    	int portNo = 4444;
    	String internalMessage;
    	
    	// provide a start message...
    	System.out.println("Server: RickshawServer Class main method started");
    	
    	// Start the ServerSocket and listen on PortNo 
        try {
            serverSocket = new ServerSocket(portNo);
            // successful start
            System.out.println("Server: The Rickshaw Server was sucessfully started");
    	} 
        catch (IOException e) {
            // unsuccessful start
        	System.out.println("Server: Rickshaw Server not started, unable to listen on Port No: " + portNo);
        	e.printStackTrace();
            return;
        }
        
        // Enter a loop of continually accepting and handling client connections
        while (true) {
            try {
            	System.out.println("Server: Waiting for a client to connect.....");
                
            	// create a Socket that waits for someone to connect
                Socket clientSocket = serverSocket.accept();
            	
            	// someone has connected and program continues
                System.out.println("Server: A new client has connected.....");                
                
            } 
            catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}

