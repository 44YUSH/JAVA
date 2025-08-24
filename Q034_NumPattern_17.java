/*
Pattern 17 : 

    * 
    * * 
* * * * * 
    * * 
    *    

 */

import java.util.*;
public class Q034_NumPattern_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no : ");
        int n = sc.nextInt();

        System.out.println("\nYour pattern : \n");

        int space = n/2;
        int star = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= space; j++){
                if(i == (n/2)+1){
                    /* SKIP */
                }
                else{
                    System.out.print("  ");
                }  
            }
            if(i == (n/2)+1){
                for(int k = 1; k <= n; k++){
                System.out.print("* ");
                }
            }
            else{
                for(int k = 1; k <= star; k++){
                    System.out.print("* ");
                }
            }

            if(i <= n/2){
                star++;
            }
            else{
                star--;
            }
            System.out.println();
        }
    }
}
