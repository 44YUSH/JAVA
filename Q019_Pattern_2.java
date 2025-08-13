/*
Pattern 2 : 

* * * * * 
* * * * 
* * * 
* * 
* 

 */

import java.util.*;
public class Q019_Pattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no : ");
        int n = sc.nextInt();

        System.out.println("\nYour pattern : \n");
        for(int i = n; i > 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
