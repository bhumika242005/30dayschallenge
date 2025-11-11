import java.io.*;
import java.net.*;

public class day67 {
    public static void main(String[] args) {
        try {
            // Create server socket on port 5000
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server started. Waiting for client connection...");

            // Accept client connection
            Socket socket = serverSocket.accept();
            System.out.println(" Client connected!");

            //  Input and output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Communication
            String message = in.readLine();
            System.out.println("Message from client: " + message);

            out.println("Hello Client, message received successfully!");

            // Close connections
            in.close();
            out.close();
            socket.close();
            serverSocket.close();
            System.out.println("Server closed.");
        } catch (IOException e) {
            System.out.println(" Error: " + e.getMessage());
        }
    }
}
