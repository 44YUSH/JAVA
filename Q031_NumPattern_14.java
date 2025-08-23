/*
Pattern 14 : 

2 X 1 = 2
2 X 2 = 4
2 X 3 = 6
2 X 4 = 8
2 X 5 = 10
2 X 6 = 12
2 X 7 = 14
2 X 8 = 16
2 X 9 = 18
2 X 10= 20 

 */

import java.util.*;
public class Q031_NumPattern_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no : ");
        int n = sc.nextInt();

        System.out.println("\nYour Table : \n");

        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(n+" X "+i+" = "+(n*i));
        }
    }
}
