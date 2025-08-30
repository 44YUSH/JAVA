import java.util.*;
public class Q044_FindElementInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length of the ARRAY : ");
        int len = sc.nextInt();

        int arr[] = new int [len];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter num "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the num to search : ");
        int srch = sc.nextInt();

        for(int j = 0 ; j < arr.length; j++){
            if(arr[j] == srch){
                System.out.println(srch+" is found in INDEX "+j);
            }            
        }
    }
}
