import java.io.*;
import java.util.ArrayList;

class Student implements Serializable {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() { return name; }
    public int getMarks() { return marks; }

    @Override
    public String toString() {
        return name + " → " + marks + " marks";
    }
}

public class day64 {
    public static void main(String[] args) {
        String filename = "students.dat";
        ArrayList<Student> students = new ArrayList<>();

        // Add student objects
        students.add(new Student("Bhumika Intelligent", 95));
        students.add(new Student("Neha", 88));
        students.add(new Student("Aman", 76));

        // Write objects to file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(students);
            System.out.println("Student data saved successfully to file!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Read objects back from file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            ArrayList<Student> loadedStudents = (ArrayList<Student>) ois.readObject();
            System.out.println("\nStudent Records (Loaded from File):");
            for (Student s : loadedStudents) {
                System.out.println(s);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
