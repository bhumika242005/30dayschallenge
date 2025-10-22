import java.util.*;
public class day46 {
    // Function to find GCD (used for LCM)
    static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to find LCM using the GCD
    static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int lcm = findLCM(num1, num2);

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
        sc.close();
    }
}
