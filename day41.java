public class day41 {
    public static void main(String[] args) {
        String str = "JavaProgramming";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); // append characters in reverse order
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
    }
}
