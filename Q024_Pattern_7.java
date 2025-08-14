/*
Pattern 7 : 

*
  *
    *
      *
        * 

 */

import java.util.*;
public class Q024_Pattern_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no : ");
        int n = sc.nextInt();

        System.out.println("\nYour pattern : \n");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j < i; j++){
                System.out.print("  ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
