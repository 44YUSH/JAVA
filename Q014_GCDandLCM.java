import java.util.*;
public class Q014_GCDandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter your num2 : ");
        int num2 = sc.nextInt();

        int actNum1 = num1, actNum2 = num2;
        while(num1 % num2 != 0){
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }

        int gcd = num2;
        int lcm = (actNum1 * actNum2) / gcd;

        System.out.println("GDC of "+actNum1+" and "+actNum2+" is : "+gcd);
        System.out.println("LCM of "+actNum1+" and "+actNum2+" is : "+lcm);
    }
}
