import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientChat {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Connected to server.");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner sc = new Scanner(System.in);

            String messageFromServer, messageFromClient;

            while (true) {
                System.out.print("You: ");
                messageFromClient = sc.nextLine();
                out.println(messageFromClient);

                if (messageFromClient.equalsIgnoreCase("exit")) {
                    System.out.println(" Chat ended.");
                    break;
                }

                messageFromServer = in.readLine();
                if (messageFromServer == null || messageFromServer.equalsIgnoreCase("exit")) {
                    System.out.println(" Server ended the chat.");
                    break;
                }

                System.out.println(" Server: " + messageFromServer);
            }

            sc.close();
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            System.out.println(" Error: " + e.getMessage());
        }
    }
}
