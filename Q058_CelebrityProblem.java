/* Celebrity problem :

Celebrity --- Known by everybody but it knows nobody.

    0   1   2   3

0   x   V   V   V

1   V   x   V   x

2   x   x   x   x

3   V   V   V   x

here 2 is a celebrity as 2 knows nobody but everybody knows 2.

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Q058_CelebrityProblem {
    public static void main(String[] args) throws IOException {
            
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [][] arr = new int[n][n];

        for(int j = 0; j < n; j++){
            String line = br.readLine();
            for(int k = 0; k < n; k++){
                arr[j][k] = line.charAt(k) - '0';
            }
        }
        findCelebrity(arr);
    }

    public static void findCelebrity(int [][] arr){
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < arr.length; i++){
            st.push(i);
        }
        while(st.size() >= 2){
            int i = st.pop();
            int j = st.pop();

            if(arr[i][j] == 1){
                // if i knows j -> i is not a celebrity.
                st.push(j);
            }
            else{
                // if i knows j -> j is not a celebrity.
                st.push(i);
            }
        }

        int pot = st.pop();
        for(int i = 0; i < arr.length; i++){
            if(i != pot){
                if(arr[i][pot] == 0 || arr[pot][i] == 1){
                    System.out.println("NO Celebrity");
                    return;
                }
            }
        }
        System.out.println(pot+" is the Celebrity !");
    }
}
