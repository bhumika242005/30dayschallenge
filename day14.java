import java.util.Scanner;
public class day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in 5 subjects: ");
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += sc.nextInt();
        }
        double avg = sum / 5.0;

        System.out.println("Average = " + avg);
        if (avg >= 90) System.out.println("Grade = A");
        else if (avg >= 75) System.out.println("Grade = B");
        else if (avg >= 50) System.out.println("Grade = C");
        else System.out.println("Grade = F");
    }
}
