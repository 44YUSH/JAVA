import java.util.*;
public class Q047_DiffOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

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

        int diff[] = new int[n2];
        int borrow = 0;

        int i = a1.length-1;
        int j = a2.length-1;
        int k = diff.length-1;

        while(k >= 0){
            int dig = 0;
            int a1v = i >= 0? a1[i]: 0;

            if(a2[j] + borrow >= a1v){
                dig = a2[j] + borrow - a1v;
                borrow = 0;
            }
            else{
                dig = a2[j] + borrow + 10 - a1v;
                borrow = -1;
            }

            diff[k] = dig;

            i--;
            j--;
            k--;
        }

        int idx =0;
        while(idx < diff.length){
            if(diff[idx] == 0){
                idx++;
            }
            else{
                break;
            }
        }
        while(idx < diff.length){
            System.out.println(diff[idx]);
            idx++;
        }
    }
}
