import java.io.*;

public class day31 {
    public static void main(String[] args) {
        String fileName = "day31_notes.txt";

        // 1 Write to file using BufferedWriter
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Day 31 - Advanced File Handling in Java");
            writer.newLine();
            writer.write("This file demonstrates reading and writing using Buffered Streams.");
            writer.newLine();
            writer.write("Created by Bhumika Intelligent");
            System.out.println("File written successfully!");
        } catch (IOException e) {
            System.out.println("Error while writing: " + e.getMessage());
        }

        // 2 Read from file using BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("\n📖 Reading content from file:\n");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(" " + line);
            }
        } catch (IOException e) {
            System.out.println("Error while reading: " + e.getMessage());
        }

        // 3 Append more content using FileWriter (append mode)
        try (FileWriter appendWriter = new FileWriter(fileName, true)) {
            appendWriter.write("\nAppended line: Java File Handling is powerful!");
            System.out.println("\n Content appended successfully!");
        } catch (IOException e) {
            System.out.println(" Error while appending: " + e.getMessage());
        }
    }
}
