public class day51 {
    public static void main(String[] args) {
        int[] arr = {25, 78, 12, 56, 89, 43, 5};

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest)
                largest = arr[i];
            if (arr[i] < smallest)
                smallest = arr[i];
        }

        System.out.println("Array elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nLargest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}
