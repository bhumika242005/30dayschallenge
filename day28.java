import java.io.*;

// A Student class that can be saved to a file
class Student implements Serializable {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }
}

public class day28 {
    public static void main(String[] args) {
        String filename = "student.dat";

        // Serialize (save object to file)
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            Student s1 = new Student(101, "Bhumika", 95.5);
            out.writeObject(s1);
            System.out.println("Student saved to file.");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        // Deserialize (read object back from file)
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Student s2 = (Student) in.readObject();
            System.out.println("Student read from file: " + s2);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e);
        }
    }
}
