public class c_TypePromotion {
    public static void main(String[] args) {
        
        char ch = 'a';
        char ch2 = 'b';

        System.out.println(ch + ch2); // Automatic Implicit type promotion to int
        // 'a' + 'b' = 97 + 98 = 195
        // byte, short, and char are promoted to int during arithmetic operations

        int a = 10;
        float b = 20.5f;
        System.out.println(a + b); // Automatic Implicit type promotion to float
        // 10 + 20.5f = 30.5f
        // if float, long, or double is involved in an arithmetic operation,
        // all operands are promoted to that type
    }
}
