import java.util.*;
public class Q013_RotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the no : ");
        int n = sc.nextInt();

        System.out.println("Enter the no. of ROTATIONs : ");
        int rotate = sc.nextInt();

        int dig = 0;
        int temp1 = n;
        while(temp1 != 0){
            temp1 = temp1 / 10;
            dig++;
        }


        int temp2 = n;
        for(int i=0; i<rotate; i++){
            int rem = temp2 % 10;
            temp2 = temp2 / 10;
            int result = (int) (temp2 + (rem * Math.pow(10, dig-1)));
            temp2 = result;
        }
        System.out.println("Num after "+rotate+" rotations : "+temp2);
    }
}
