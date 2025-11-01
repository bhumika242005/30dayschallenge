public class day56 {
    public static void main(String[] args) {
        String str = "A man a plan a canal Panama";
        str = str.replaceAll("\\s+", "").toLowerCase();  // Remove spaces and convert to lowercase

        boolean isPalindrome = true;
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println("Original String: A man a plan a canal Panama");
        if (isPalindrome)
            System.out.println("Result: Palindrome");
        else
            System.out.println("Result: Not a Palindrome");
    }
}
