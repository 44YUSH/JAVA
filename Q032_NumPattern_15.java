/*
Pattern 15 : 

    1 
  2 3 2 
3 4 5 4 3 
  2 3 2 
    1   

 */

import java.util.*;
public class Q032_NumPattern_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no : ");
        int n = sc.nextInt();

        System.out.println("\nYour pattern : \n");

        int space = n/2;
        int star = 1;
        int count = 1;
        for(int i = 1; i <= n; i++){
          for(int j = 1; j <= space; j++){
            System.out.print("  ");
          }
          int temp = count;
          for(int k = 1; k <= star; k++){
            System.out.print(temp+" ");
            if(k <= star/2){
                temp++;
            }
            else{
                temp--;
            }
          }
          if(i <= n/2){
            space--;
            star+=2;
            count++;
          }
          else{
            space++;
            star-=2;
            count--;
          }
          System.out.println();
        }
    }
}
