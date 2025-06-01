public class d_ArithmeticOperations {
    public static void main(String[] args) {
        
        // Binary Arithmetic Operations
        int a = 10;
        int b = 5;
        System.out.println("Add = " + (a+b)); 
        System.out.println("Product = " + (a*b));
        System.out.println("Difference = " + (a-b)); 

        // Unary Arithmetic Operations
        int c = 10;
        int d = c++; // Post-increment: d = 10, c = 11
        // c is first assigned to d, then incremented
        System.out.println(c+" "+d);
        // similar for decrement 
        int e = 10;
        int f = ++e; // Pre-increment: f = 11, e = 11
        // e is incremented first, then assigned to f
        System.out.println(e+" "+f);

        // Ternary Operator later during conditional statements
    }
}
