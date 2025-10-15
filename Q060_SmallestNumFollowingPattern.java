import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q060_SmallestNumFollowingPattern {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Stack st = new Stack<>();
        
        int num = 1;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == 'd'){
                st.push(num);
                num++;
            }
            else{
                st.push(num);
                num++;

                while(st.size() > 0){
                    System.out.print(st.pop()+" ");
                }
            }
        }
        while(st.size() > 0){
            System.out.println(st.pop());
        }
    }
}
