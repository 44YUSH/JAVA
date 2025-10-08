import java.util.*;

public class Q053_SlidingWindowMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length : ");
        int l = sc.nextInt();
        int arr[] = new int[l];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the window size (K) : ");
        int k = sc.nextInt();

        int res[] = new int[l - k + 1];

        for (int start = 0; start <= l - k; start++) {
            Stack<Integer> st = new Stack<>();
            int max = arr[start];

            // push all elements of current window
            for (int i = start; i < start + k; i++) {
                st.push(arr[i]);
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            res[start] = max;
        }

        // Print results
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
