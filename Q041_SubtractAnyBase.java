import java.util.*;
public class Q041_SubtractAnyBase {
    public static int SubtractAnyBase(int n1, int n2, int base) {
    int result = 0;
    int power = 0;
    int borrow = 0;

    while (n2 > 0 || n1 > 0) {
        int rem1 = n1 % 10;
        int rem2 = n2 % 10;

        rem2 += borrow;

        if (rem2 > rem1) {
            rem1 += base;
            borrow = 1;
        } else {
            borrow = 0;
        }

        int diff = rem1 - rem2;
        result += diff * Math.pow(10, power);

        power++;
        n1 /= 10;
        n2 /= 10;
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

        System.out.println(SubtractAnyBase(n1, n2, base));
    }
}
