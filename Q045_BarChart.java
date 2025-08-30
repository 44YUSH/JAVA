import java.util.*;
public class Q045_BarChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length of the Bar chart : ");
        int len = sc.nextInt();

        int a[] = new int [len];
        for(int i = 0; i < a.length; i++){
            System.out.print("Enter value "+(i+1)+" : ");
            a[i] = sc.nextInt();
        }

        int max = a[0];
        for(int i = 1; i < a.length; i++){
            if(max < a[i]){
                max = a[i];
            }
        }

        int sp = 0;
        int st = 0;
        for(int i = max; i >= 1; i--){
            for(int j = 0; j < a.length; j++){
                if(a[j] >= i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
