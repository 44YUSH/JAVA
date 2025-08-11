/*
PRIME NUMBER

If P & Q are two nos. and (PQ = n) ,
then, P !> root(n) and Q !> root(n).
 */

import java.util.*;
public class Q006_PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no : ");
        int t = sc.nextInt();

        for(int i=0; i<t; i++){
            System.out.print("Enter no "+(i+1)+": ");
            int n = sc.nextInt();

            int count = 0;
            for(int div = 2; div * div <= n; div++){
                if(n % div == 0){
                    count++;
                    break;
                }
            }

            if(count == 0){
                System.out.println("PRIME");
            }
            else{
                System.out.println("NOT PRIME");
            }
        }
    }
}
