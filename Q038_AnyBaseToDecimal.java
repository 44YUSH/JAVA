import java.util.*;
public class Q038_AnyBaseToDecimal {
    public static int AnyBaseToDecimal(int num, int base){
        int result = 0;
        int count = 0;
        while(num > 0){
            int rem = num % 10;
            result += (int)(rem * Math.pow(base, count));
            count++;
            num /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Number : ");
        int num = sc.nextInt();
        System.out.print("Enter your BASE : ");
        int base = sc.nextInt();

        System.out.println(AnyBaseToDecimal(num, base));
    }
}
