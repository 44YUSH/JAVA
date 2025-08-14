/*
Pattern 3 : 

* * * * * 
  * * * * 
    * * * 
      * * 
        *

 */

import java.util.*;
public class Q020_Pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no : ");
        int n = sc.nextInt();

        System.out.println("\nYour pattern : \n");
        int count=n+1;
        for(int i = 0; i < n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("  ");
            }
            count--;
            for(int k=count; k >= 1; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
