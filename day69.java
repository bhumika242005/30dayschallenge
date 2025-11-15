import java.net.Socket;

public class day69 {
    public static void main(String[] args) {
        String host = "localhost";  // you can change host
        System.out.println(" Scanning open ports on: " + host);

        for (int port = 1; port <= 1024; port++) {
            try {
                Socket socket = new Socket(host, port);
                System.out.println("Port " + port + " is OPEN");
                socket.close();
            } catch (Exception e) {
                // Port is closed, do nothing
            }
        }

        System.out.println(" Scan completed.");
    }
}
