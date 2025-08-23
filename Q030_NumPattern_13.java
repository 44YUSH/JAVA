/*

Permutation and Combination
------------------------+
n         n
 C  = 1 =  C
  0         n


n     n
 C  =  C
  k     n-k

------------------------+
FORMULA : 

i       i               /
 C  =    C  . (i - j)  /  j + 1
  j+1     j           /

------------------------+

Pattern 13 : 

1 
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1 
1 5 10 10 5 1

 */

import java.util.*;
public class Q030_NumPattern_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no : ");
        int n = sc.nextInt();

        System.out.println("\nYour pattern : \n");

        
        for(int i = 0; i < n; i++){
            int iCj =1;
            for(int j = 0; j <= i; j++){
                System.out.print(iCj+" ");
                int iCjp1 = iCj * (i-j)/(j+1);
                iCj = iCjp1;
          }
          System.out.println();
        }
    }
}
