import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class day61 {
    public static void main(String[] args) {
        String filePath = "sample.txt"; // make sure the file exists in the same directory
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                if (words.length > 0 && !words[0].isEmpty()) {
                    wordCount += words.length;
                }
            }
            System.out.println("Total words in file: " + wordCount);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
