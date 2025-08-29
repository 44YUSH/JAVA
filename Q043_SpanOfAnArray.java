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

        int max = 0, min = 0, span = 0;
        for(int j = 0; j < arr.length; j++){
            if(max < arr[j]){
                max = arr[j];
            }
        }
        min = max;
        for(int j = 0; j < arr.length; j++){
            if(min > arr[j]){
                min = arr[j];
            }
        }
        span = max - min;

        System.out.println("Max  : "+max);
        System.out.println("Min  : "+min);
        System.out.println("Span : "+span);

    }
}
