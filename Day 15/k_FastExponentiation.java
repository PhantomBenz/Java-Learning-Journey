public class k_FastExponentiation {
    public static int fastExponentiation(int base, int exponent) {
        int result = 1;
        while (exponent > 0) {
            if ((exponent & 1) == 1) { // If the last bit of exponent is set
                result *= base; // Multiply the result by the base
            }
            base *= base; // Square the base
            exponent >>= 1; // Right shift the exponent by 1
        }
        return result;
    }
    public static void main(String[] args) {
        int base = 2; // Example base
        int exponent = 10; // Example exponent
        int result = fastExponentiation(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result); // Output: 1024
    }
}
