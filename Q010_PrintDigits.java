import java.util.*;
public class Q010_PrintDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your no : ");
        int n = sc.nextInt();

        int dig=0;
        int temp = n;
        while(temp != 0){
            temp = temp / 10;
            dig++;
        }

        System.out.println("\nYour DIGITs are : ");
        int pwr = (int)Math.pow(10, dig - 1);
        while(n != 0){
            int q = n / pwr;
            System.out.println(q);
            n = n % pwr;
            pwr = pwr / 10;
        }
    }
}
