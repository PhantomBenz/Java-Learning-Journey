public class j_CountSetBits {
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1); // Increment count if the last bit is set
            n >>= 1; // Right shift to check the next bit
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 29; // Example number
        int result = countSetBits(number);
        System.out.println("Number of set bits in " + number + ": " + result); // Output: 4
    }
}
