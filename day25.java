import java.util.HashMap;

public class day25 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Bhumika", 90);
        map.put("Riya", 85);
        map.put("Priya", 95);

        System.out.println("Marks: " + map);

        System.out.println("Bhumika's Marks: " + map.get("Bhumika"));
    }
}
