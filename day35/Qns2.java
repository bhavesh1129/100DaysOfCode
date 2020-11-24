//Balanced Brackets
import java.util.*;

public class Qns2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                boolean value = checkingMore(st,'(');
                if (value == false) {
                    System.out.println(value);
                    return;
                }
            } else if (ch == '}') {
                boolean value = checkingMore(st,'{');
                if (value == false) {
                    System.out.println(value);
                    return;
                }
            } else if (ch == ']') {
                boolean value = checkingMore(st,'[');
                if (value == false) {
                    System.out.println(value);
                    return;
                }
            }
        }
        if(st.size() == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    private static boolean checkingMore(Stack<Character> st, char c) {
        if (st.size() == 0) {
            return false;
        } else if (st.peek() != c) {
            return false;
        } else {
            st.pop();
            return true;
        }
    }
}
