import java.util.*;
public class Q037_DecToAnyBase {
    public static int DecToAnyBase(int dec, int base){
        int result=0;
        int power = 1;
        while(dec > 0){
            int dig = dec % base;
            dec = dec / base;

            result += dig * power;
            power *= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your DECIMAL : ");
        int dec = sc.nextInt();
        System.out.print("Enter your BASE : ");
        int base = sc.nextInt();

        System.out.println(DecToAnyBase(dec, base));
    }
}
