public class day36 {
    // Function to print the Fibonacci series up to n terms
    static int fibonacci(int n) {
        if (n <= 1)
            return n; // base case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // number of terms
        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
