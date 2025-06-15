public class g_ClearLastIBits {
    public static int clearLastIBits(int n, int i) {
        return n & ~(0) << i; // Clear the last i bits
    }

    public static void main(String[] args) {
        int number = 29; // Binary: 11101
        int bitsToClear = 3; // Clear the last 3 bits
        int result = clearLastIBits(number, bitsToClear);
        System.out.println("Number after clearing last " + bitsToClear + " bits: " + result); // Output: 24 (11000)
    }
}
