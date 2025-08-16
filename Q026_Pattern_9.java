/*
Pattern 9 : 

        *
      *
    *
  *
* 

 */

import java.util.*;
public class Q026_Pattern_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no : ");
        int n = sc.nextInt();

        System.out.println("\nYour pattern : \n");

        int space = n-2;
        for(int i = 1; i <= n; i++){
            
            System.out.println();
        }
    }
}
