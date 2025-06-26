import java.util.*;
public class StackB {
    public static void printStack(Stack<Integer> s) {
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }

    public static StringBuilder reverseString(String str) {
        StringBuilder rev = new StringBuilder("");
        Stack<Character> s = new Stack<>();
        int i = 0;
        while(i < str.length()) {
            s.push(str.charAt(i));
            i++;
        }
        while(!s.empty()) {
            rev.append(s.pop());
        }
        return rev;
    }

    public static void reverseStack(Stack<Integer> s) {
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);

    } 

    public static void stockSpan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for(int i=1; i < stocks.length; i++) {
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice > stocks[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()) {
                span[i] = i+1;
            }
            else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }

            s.push(i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Problem 1 : Add 4 to the bottom of already existing Stack");
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(s,4);
        printStack(s);

        System.out.println("Problem 2 : Reverse a String");
        String str = new String("Chocolate");
        System.out.println(reverseString(str));

        System.out.println("Problem 3 : Reverse a Stack");
        Stack<Integer> rs = new Stack<>();
        rs.push(1);
        rs.push(2);
        rs.push(3);
        printStack(rs);

        System.out.println("Problem 4: Stock Span Problem");
        // span is max no. of consecutve days for which, price <= todays'price
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);

        for(int i = 0; i < span.length; i++) {
            System.out.println(span[i] + " ");
        }
    }
}
