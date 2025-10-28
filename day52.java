public class day52 {
    public static void main(String[] args) {
        int[] arr = {11, 24, 37, 42, 55, 68, 79, 80};
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Array elements:");
        for (int num : arr) {
            System.out.print(num + " ");
            if (num % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        System.out.println("\n\nTotal even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);
    }
}
