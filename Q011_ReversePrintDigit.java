import java.util.*;
public class Q011_ReversePrintDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no : ");
        int n = sc.nextInt();

        int dig = 0;
        int temp1 = n;
        while(temp1 != 0){
            temp1 = temp1 / 10;
            dig++;
        }

        for(int i=0; i < dig; i++){
            int rem = n % 10;
            System.out.println(rem);
            n = n / 10;
        }
    }
}
