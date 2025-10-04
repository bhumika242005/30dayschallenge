import java.util.*;

public class day26 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 10, 15, 20);

        nums.forEach(n -> System.out.println("Number: " + n));

        int sum = nums.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum = " + sum);
    }
}
