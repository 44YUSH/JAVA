/*
Pattern 4 : 

Enter ODD numbers for better result.

    *     
  * * *   
* * * * * 
  * * *   
    *

 */

import java.util.*;
public class Q022_Pattern_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no (ODD) : ");
        int n = sc.nextInt();

        int space = n/2;
        int star = 1;
        System.out.println("\nYour pattern : \n");
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= space; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= star; k++){
                System.out.print("* ");
            }
            if(i <= n/2){
                space--;
                star+=2;
            }
            else{
                space++;
                star-=2;
            }
            System.out.println();
        }
        
    }
}
