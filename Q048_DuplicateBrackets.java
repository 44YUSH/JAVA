import java.util.*;
public class Q048_DuplicateBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your STRING : ");
        String str = sc.nextLine();

        Stack <Character> st = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ')'){
                if(st.peek() == '('){
                    System.out.println("Duplicate Brackets are there.");
                    return;
                }
                else{
                    while(st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
        }
        System.out.println("NO Duplicate Brackets are there.");
    }
}
