public class day50 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int num : numbers) {
            sum += num; // add each element
        }

        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nSum of all elements: " + sum);
    }
}
