import java.util.*;
public class Q039_AnyBaseToAnyBase {
    public static int AnyBaseToAnyBase(int num, int b1, int b2){
        // BASE to DECIMAL
        int dec = 0; int count = 0;
        int temp = num;
        while(temp > 0){
            int rem = temp % 10;
            dec += (int)(rem * Math.pow(b1, count));
            temp /= 10;
            count++;
        }

        // DECIMAL to BASE
        int result = 0;
        int power = 1;
        while(dec > 0){
            int dig = dec % b2;
            result += dig * power;
            dec = dec / b2;
            power *= 10;
        }
        return result; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Number : ");
        int num = sc.nextInt();
        System.out.print("Enter BASE of given NUMBER : ");
        int b1 = sc.nextInt();
        System.out.print("Enter BASE to get answer in : ");
        int b2 = sc.nextInt();

        System.out.println(AnyBaseToAnyBase(num, b1, b2));
    }
}
