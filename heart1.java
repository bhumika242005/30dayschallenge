import java.util.*;
public class heart1{
    public static void main(String[]args){
    int n =5;
      for (int i = n / 2; i <= n; i += 2) {
            for (int j = 1; j < n - i; j += 2)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print("*");

            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }
        for(int i=1;i<=n-3;i++){
            for(int j=1;j<=2*n-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom part of heart
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++)
                System.out.print(" ");

            for (int j = 1; j <= (i * 2) - 1; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}