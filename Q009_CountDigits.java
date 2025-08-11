import java.util.*;
public class Q009_CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your no : ");
        int n = sc.nextInt();

        int dig=0;
        while(n != 0){
            n = n / 10;
            dig++;
        }
        System.out.println("It's a "+dig+" digit no.");
    }
}
