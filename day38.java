public class day38 {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 67, 23, 89, 34, 22};

        int largest = numbers[0]; // assume first element is largest

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest number in the array is: " + largest);
    }
}
