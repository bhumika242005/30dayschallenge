public class day48 {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 67, 89, 23, 56, 88};

        // Initialize largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Second largest number: " + secondLargest);
    }
}
