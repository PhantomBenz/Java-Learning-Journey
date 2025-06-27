import java.util.*;
public class ValidParentheses {
    public static void checkValidity(String str) {
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                s.push(str.charAt(i));
            }
            else if((str.charAt(i) == ')' && s.peek() == '(') 
                || (str.charAt(i) == '}' && s.peek() == '{') 
                || (str.charAt(i) == ']' && s.peek() == '[')) {
                    
                s.pop();
            }
            else {
                System.out.println("Invalid");
                return;
            }
        }
        if(!s.empty()) {
            System.out.println("Invalid");
            return;
        }
        System.out.println("Valid");
        return;
    }

    public static void main(String[] args) {
        checkValidity("(){}[()]");
    }
}
