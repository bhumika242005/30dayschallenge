import java.util.ArrayList;
import java.util.HashMap;

public class day63 {
    public static void main(String[] args) {
        // ArrayList example
        ArrayList<String> students = new ArrayList<>();
        students.add("Bhumika");
        students.add("Neha");
        students.add("Riya");
        students.add("Aman");

        System.out.println("ArrayList of Students:");
        for (String name : students) {
            System.out.println("- " + name);
        }

        // HashMap example
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Bhumika", 92);
        marks.put("Neha", 87);
        marks.put("Riya", 95);
        marks.put("Aman", 78);

        System.out.println("\nStudent Marks:");
        for (String name : marks.keySet()) {
            System.out.println(name + " → " + marks.get(name));
        }

        // Retrieve a specific student's marks
        String search = "Bhumika";
        System.out.println("\n" + search + "'s Marks: " + marks.get(search));
    }
}
