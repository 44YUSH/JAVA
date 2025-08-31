import java.util.*;
public class Q046_SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of 1st array : ");
        int n1 = sc.nextInt();
        int a1[] = new int[n1];
        for(int i = 0; i < a1.length; i++){
            System.out.print("num "+(i+1)+" : ");
            a1[i] = sc.nextInt();
        }

        System.out.println("Enter length of 2nd array : ");
        int n2 = sc.nextInt();
        int a2[] = new int[n2];
        for(int j = 0; j < a2.length; j++){
            System.out.print("num "+(j+1)+" : ");
            a2[j] = sc.nextInt();
        }

        int sum [] = new int [n1 > n2? n1:n2];
        int carry = 0;

        int i = a1.length-1;
        int j = a2.length-1;
        int k = sum.length-1;

        while(k >= 0){
            int dig = carry;

            if(i >= 0){
                dig += a1[i];
            }
            if(j >= 0){
                dig += a2[j];
            }

            carry = dig / 10;
            dig = dig % 10;

            sum[k] = dig;

            i--;
            j--;
            k--;
        }

        if(carry != 0){
            System.out.print(carry+" ");
        }
        for(int val : sum){
            System.out.print(val+" ");
        }
    }
}
