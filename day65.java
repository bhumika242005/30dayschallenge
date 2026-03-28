import java.io.*;
import java.util.Scanner;

public class day65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = "notes.txt";

        try {
            // Write data to file
            System.out.println("Enter some text to save (type 'stop' to finish):");
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);

            while (true) {
                String line = sc.nextLine();
                if (line.equalsIgnoreCase("stop")) break;
                bw.write(line);
                bw.newLine();
            }

            bw.close();
            fw.close();
            System.out.println("Data successfully written to file: " + filename);

            // Read data from file
            System.out.println("\nReading data from file:");
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String fileLine;

            while ((fileLine = br.readLine()) != null) {
                System.out.println(fileLine);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("File operation failed: " + e.getMessage());
        }

        sc.close();
    }
}
