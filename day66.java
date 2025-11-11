import java.io.*;
import java.util.*;

public class day66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = "notes.txt";

        while (true) {
            System.out.println("\n===== File Operations Menu =====");
            System.out.println("1. Append to File");
            System.out.println("2. Search in File");
            System.out.println("3. Delete a Line from File");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    appendToFile(filename, sc);
                    break;
                case 2:
                    searchInFile(filename, sc);
                    break;
                case 3:
                    deleteLineFromFile(filename, sc);
                    break;
                case 4:
                    System.out.println("👋 Exiting program. Goodbye, Bhumika Intelligent!");
                    sc.close();
                    return;
                default:
                    System.out.println(" Invalid choice. Try again.");
            }
        }
    }

    // Append content to the file
    public static void appendToFile(String filename, Scanner sc) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true))) {
            System.out.println("Enter text to append (type 'stop' to finish):");
            while (true) {
                String line = sc.nextLine();
                if (line.equalsIgnoreCase("stop")) break;
                bw.write(line);
                bw.newLine();
            }
            System.out.println("Data appended to file successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Search for a keyword in the file
    public static void searchInFile(String filename, Scanner sc) {
        System.out.print("Enter word to search: ");
        String keyword = sc.nextLine();
        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNum = 1;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains(keyword.toLowerCase())) {
                    System.out.println("Found at line " + lineNum + ": " + line);
                    found = true;
                }
                lineNum++;
            }
            if (!found) System.out.println("Word not found in file.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Delete a line from file
    public static void deleteLineFromFile(String filename, Scanner sc) {
        System.out.print("Enter line number to delete: ");
        int lineToDelete = sc.nextInt();
        sc.nextLine();

        List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        if (lineToDelete <= 0 || lineToDelete > lines.size()) {
            System.out.println("Invalid line number!");
            return;
        }

        lines.remove(lineToDelete - 1);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (String l : lines) {
                bw.write(l);
                bw.newLine();
            }
            System.out.println(" Line " + lineToDelete + " deleted successfully!");
        } catch (IOException e) {
            System.out.println(" Error writing file: " + e.getMessage());
        }
    }
}
