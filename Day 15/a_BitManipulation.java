public class a_BitManipulation {

    public static void main(String[] args) {
        System.out.println(5&6); // Output: 4        101 AND 110 = 100

        System.out.println(5|6); // Output: 7        101 OR 110 = 111

        System.out.println(5^6); // Output: 3        101 XOR 110 = 011

        System.out.println(~5); // Output: -6       NOT 0000 0101 = 1111 1010 and after 2's complement it becomes -6

        System.out.println(5<<2); // Output: 20       0000 0101 << 1 = 0001 0100      a << b is equivalent to a * 2^b

        System.out.println(20>>2); // Output: 5       0001 0100 >> 2 = 0000 0101

        
    }
}