import java.io.*;

public class day23 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("output.txt");
            fw.write("Hello Bhumika, this is a file example.");
            fw.close();

            FileReader fr = new FileReader("output.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("File Error: " + e);
        }
    }
}
