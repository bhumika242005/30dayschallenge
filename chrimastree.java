import java.util.*;
public class chrimastree{
    public static void main(String[]args){
        int n = 3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2;j++){
                System.out.print(" ");
            }
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=1;j++){
                System.out.print(" ");
            }
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i+3;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=3;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=3;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}