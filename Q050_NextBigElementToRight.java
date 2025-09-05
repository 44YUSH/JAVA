import java.util.*;

public class Q050_NextBigElementToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int len = sc.nextInt();

        int arr[] = new int[len];
        System.out.print("Enter your elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Next Greater Elements: ");
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    System.out.print(arr[j] + " ");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print("-1 ");
            }
        }
    }
}
