public class day40 {
    public static void main(String[] args) {
        int number = 9875;
        int sum = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10; // extract last digit
            sum += digit;
            temp /= 10; // remove last digit
        }

        System.out.println("Sum of digits of " + number + " is: " + sum);
    }
}
