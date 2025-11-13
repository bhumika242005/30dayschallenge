import java.io.*;
import java.net.*;

public class day68 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server started. Waiting for client connection...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader serverInput = new BufferedReader(new InputStreamReader(System.in));

            String messageFromClient, messageFromServer;

            // Two-way communication
            while (true) {
                messageFromClient = in.readLine();
                if (messageFromClient == null || messageFromClient.equalsIgnoreCase("exit")) {
                    System.out.println("Client ended the chat.");
                    break;
                }
                System.out.println("Client: " + messageFromClient);

                System.out.print("You: ");
                messageFromServer = serverInput.readLine();
                out.println(messageFromServer);

                if (messageFromServer.equalsIgnoreCase("exit")) {
                    System.out.println("Server ended the chat.");
                    break;
                }
            }

            // Closing resources
            in.close();
            out.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
