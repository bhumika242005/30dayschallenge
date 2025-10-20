public class day44 {
    public static void main(String[] args) {
        int number = 153;
        int originalNumber = number;
        int remainder, result = 0;

        while (number != 0) {
            remainder = number % 10;
            result += Math.pow(remainder, 3);
            number /= 10;
        }

        if (result == originalNumber)
            System.out.println(originalNumber + " is an Armstrong number.");
        else
            System.out.println(originalNumber + " is not an Armstrong number.");
    }
}
