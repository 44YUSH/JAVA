// SPAN = Max - Min values in the array.

import java.util.*;
public class Q043_SpanOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length of the ARRAY : ");
        int len = sc.nextInt();

        int arr[] = new int [len];

        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter num "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for(int j = 1; j < arr.length; j++){
            // MAX
            if(max < arr[j]){
                max = arr[j];
            }
            
            // MIN
            if(min > arr[j]){
                min = arr[j];
            }
        }
        int span = max - min;

        System.out.println("Max  : "+max);
        System.out.println("Min  : "+min);
        System.out.println("Span : "+span);

    }
}
