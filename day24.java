import java.util.ArrayList;

public class day24 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("Languages: " + list);

        list.remove("Python");
        System.out.println("After removal: " + list);
    }
}

