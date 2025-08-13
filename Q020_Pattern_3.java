/*
Pattern 3 : 

        * 
      * * 
    * * * 
  * * * * 
* * * * *

 */

import java.util.*;
public class Q020_Pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no : ");
        int n = sc.nextInt();

        System.out.println("\nYour pattern : \n");
        int count=0;
        for(int i = n-1; i >= 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("  ");
            }
            count++;
            for(int k=1; k <= count; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
