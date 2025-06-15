public class i_PowerOf2OrNot {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false; // Power of 2 must be positive
        return (n & (n - 1)) == 0; // Check if only one bit is set
    }

    public static void main(String[] args) {
        int number = 16; // Example number
        boolean result = isPowerOfTwo(number);
        System.out.println(number + " is a power of 2: " + result); // Output: true
    }
}
