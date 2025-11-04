import java.util.HashMap;

public class day59 {
    public static void main(String[] args) {
        String str = "bhumikaintelligent";
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character frequencies:");
        for (char c : frequencyMap.keySet()) {
            System.out.println(c + " → " + frequencyMap.get(c));
        }
    }
}
