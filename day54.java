public class day54 {
    public static void main(String[] args) {
        int[] arr = {45, 22, 89, 16, 90, 73, 56};
        int min = arr[0]; // assume first element is min

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("The smallest element in the array is: " + min);
    }
}
