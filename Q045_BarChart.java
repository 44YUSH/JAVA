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
    }
}
