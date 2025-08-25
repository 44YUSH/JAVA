import java.util.*;
public class Q036_DigitsFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num : ");
        int num = sc.nextInt();
        System.out.println("Enter the digit to count : ");
        int digit = sc.nextInt();

        int result = digFreq(num, digit);
        System.out.println(num+" has "+result+" "+digit+"'s");
    }

    public static int digFreq(int num, int digit){
        int count=0;
        while(num > 0){
            int dig = num % 10;
            num /= 10;

            if(dig == digit){
                count++;
            }
        }
        return count;
    }
}