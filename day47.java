import java.util.*;

public class day47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        int[] freq = new int[256]; // ASCII size array

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++; // increment count for each character
        }

        System.out.println("\nCharacter frequencies:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0 && Character.isLetterOrDigit((char) i)) {
                System.out.println((char) i + " : " + freq[i]);
            }
        }

        sc.close();
    }
}
