import java.util.*;
public class Q040_AddAnyBase {
    public static int AddAnyBase(int n1, int n2, int base){
        int result = 0;
        int carry = 0;
        int power = 1;
        while(n1 > 0 || n2 > 0 || carry > 0){
            int rem1 = n1 % 10;
            int rem2 = n2 % 10;
            n1 /= 10;
            n2 /= 10;

            int tot = rem1 + rem2 + carry;
            carry = tot / base;
            tot = tot % base;

            result += tot * power;
            power *= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd NUMBER : ");
        int n2 = sc.nextInt();
        System.out.print("Enter BASE : ");
        int base = sc.nextInt();

        System.out.println(AddAnyBase(n1, n2, base));
    }
}
