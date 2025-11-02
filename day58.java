public class day58 {
    public static void main(String[] args) {
        int num = 153;
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        if (sum == originalNum)
            System.out.println(originalNum + " is an Armstrong Number");
        else
            System.out.println(originalNum + " is Not an Armstrong Number");
    }
}
