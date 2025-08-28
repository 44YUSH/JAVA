import java.util.*;
public class Q041_SubtractAnyBase {
    public static int SubtractAnyBase(int n1, int n2, int base){
        int result =0;

        int max, min;
        if(n1 >= n2){
            max = n1 ; min = n2;
        }
        else{
            max = n2 ; min = n1;
        }

        int power = 100;
        int dig2 = 0;
        int count = 0;
        while(max > 0 || min > 0){
            int rem1 = max % 10;
            int rem2 = min % 10;
            int temp = rem1;
            // temp = dig2;

            if(temp < rem2){
                temp = max % power;
                dig2 = temp / (power / 10);
                temp = (temp % (power / 10)) + base;
                dig2 --;
            }
            int val = temp - rem2;
            result += (int)(val + Math.pow(10, count));
            count++;
            power *= 10;
            max /= 10;
            min /= 10;

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
