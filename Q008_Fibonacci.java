import java.util.*;
public class Q008_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no : ");
        int n = sc.nextInt();

        System.out.println("\nFibonacci Nos. are : ");
        int a = 0;
        int b = 1;
        for(int i=0; i<n; i++){
            System.out.print(a+"  ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
