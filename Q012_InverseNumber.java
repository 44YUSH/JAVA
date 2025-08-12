import java.util.*;
public class Q012_InverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no : ");
        int n = sc.nextInt();

        int invr = 0;
        int count = 1;
        while(n != 0){
            int rem = n % 10;
            invr = (int) (count * Math.pow(10, rem-1)) + invr;
            n = n / 10;
            count++;
        }
        System.out.println(invr);
    }       
}
