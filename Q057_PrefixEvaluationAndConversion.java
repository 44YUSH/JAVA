import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q057_PrefixEvaluationAndConversion {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Postfix expression: ");
        String exp = br.readLine();

        Stack<Integer> vs = new Stack<>();
        Stack<String>  is = new Stack<>();
        Stack<String>  ps = new Stack<>();

        for(int i = exp.length()-1; i >= 0; i--){
            char ch = exp.charAt(i);

            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                // Value Stack
                int v1 = vs.pop();
                int v2 = vs.pop();
                int val = operation(v1, v2, ch);
                vs.push(val);

                // Infix Stack
                String is2 = is.pop();
                String is1 = is.pop();
                String isval = "(" + is1 + ch + is2 + ")";
                is.push(isval);

                // Postfix Stack
                String ps1 = ps.pop();
                String ps2 = ps.pop();
                String psval = ps1 + ps2 + ch;
                ps.push(psval);
            }
            else{
                vs.push(ch - '0');
                ps.push(ch +  "");
                is.push(ch +  "");
            }
        }

        System.out.println(vs.pop());
        System.out.println(is.pop());
        System.out.println(ps.pop());
    }

    public static int operation(int v1, int v2, char op){
        if(op == '+'){
            return v1 + v2;
        }
        else if(op == '-'){
            return v1 - v2;
        }
        else if(op == '*'){
            return v1 * v2;
        }
        else{
            return v1 / v2;
        }
    }
}
