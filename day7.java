public class day7 {
    public static void main(String[] args) {
        int num = 121, temp = num, rev = 0;
        
        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        if (num == rev)
            System.out.println(num + " is a Palindrome");
        else
            System.out.println(num + " is Not a Palindrome");
    }
}
