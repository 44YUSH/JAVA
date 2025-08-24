/*
Pattern 16 : 

1               1 
1 2           2 1 
1 2 3       3 2 1 
1 2 3 4   4 3 2 1 
1 2 3 4 5 4 3 2 1    

 */

import java.util.*;
public class Q033_NumPattern_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no : ");
        int n = sc.nextInt();

        System.out.println("\nYour pattern : \n");

        int space = (n*2)-3;
        int star = 1;
        int count = 1;
        for(int i = 1; i <= n; i++){
          int temp1=count;
          for(int j = 1; j <= star; j++){
            System.out.print(temp1+" ");
            temp1++;
          }
          for(int k = 1; k <= space; k++){
            System.out.print("  ");
          }
          if(i < n){
            int temp2=star;
            for(int l = 1; l <= star; l++){
                System.out.print(temp2+" ");
                temp2--;
            }
          }
          else{
            int temp3=star-1;
            for(int l = 1; l <= star-1; l++){
                System.out.print(temp3+" ");
                temp3--;
            }
          }
          space-=2;
          star++;
          System.out.println();
        }
    }
}
