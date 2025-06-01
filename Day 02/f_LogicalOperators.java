public class f_LogicalOperators {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        System.out.println((a == b)+ " " + (a < b));
        System.out.println((a == b) && (a < b)); // Logical AND: true if both conditions are true
        System.out.println((a == b) || (a < b)); // Logical OR: true if at least one condition is true
        System.out.println(!(a == b)); // Logical NOT: true if the condition is false
    }    
}