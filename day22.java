public class day22 {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int c = a / b; // Error: divide by zero
            System.out.println("Result = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            System.out.println("Program finished.");
        }
    }
}
