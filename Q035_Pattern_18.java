/*
Pattern 18 : 

* * *   * 
    *   * 
* * * * * 
*   *     
*   * * *    

 */

import java.util.*;
public class Q035_Pattern_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no : ");
        int n = sc.nextInt();

        System.out.println("\nYour pattern : \n");

        int space1 = 0;
        int star1  = 0;
        int space2 = 0;
        int star2  = 0;
        int space3 = 0;
        for(int i = 1; i <= n; i++){
            if(i == 1){
                space1=0;
                star1=(n/2)+1;
                space2=(n/2)-1;
                star2=1;
            }
            else if(i <= n/2 && i > 1){
                space1=n/2;
                star1=1;
                space2=(n/2)-1;
                star2=1;
            }
            else if(i == (n/2)+1){
                space1=0;
                star1=(n/2)+1;
                space2=0;
                star2=n/2;
            }
            else if(i > n/2 && i < n){
                space1=0;
                star1=1;
                space2=(n/2)-1;
                star2=1;
                space3 = n/2;
            }
            else if(i == n){
                space1=0;
                star1=1;
                space2=(n/2)-1;
                star2=(n/2)+1;
            }
            for(int j = 1; j <= space1; j++){
                System.out.print("  ");  
            }
            for(int k = 1; k <= star1; k++){
                System.out.print("* ");  
            }
            for(int l = 1; l <= space2; l++){
                System.out.print("  ");  
            }
            for(int m = 1; m <= star2; m++){
                System.out.print("* ");  
            }
            for(int o = 1; o <= space3; o++){
                System.out.print("  ");  
            }
            System.out.println();
        }
    }
}
