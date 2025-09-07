import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q050_NextBigElementToRightUsingStack {

    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static int[] solve(int[] arr) {
        int[] nextBigElem = new int[arr.length];

        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length - 1]);
        nextBigElem[arr.length - 1] = -1;

        for (int i = arr.length - 2; i >= 0; i--) {
            // Pop smaller or equal elements
            while (st.size() > 0 && arr[i] >= st.peek()) {
                st.pop();
            }

            if (st.size() == 0) {
                nextBigElem[i] = -1;
            } else {
                nextBigElem[i] = st.peek();
            }

            // Push current element back for future comparisons
            st.push(arr[i]);
        }
        return nextBigElem;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int nextBigElem[] = solve(a);
        display(nextBigElem);
    
    }
}
