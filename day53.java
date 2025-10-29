public class day53 {
    public static void main(String[] args) {
        int[] arr = {45, 22, 89, 16, 90, 73, 56, 99};
        int max = arr[0]; // assume first element is max

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The largest element in the array is: " + max);
    }
}
