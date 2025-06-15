public class h_ClearRangeOfBits {
    public static int clearRangeOfBits(int n, int i, int j) {
        int a = (~0) << (j + 1); // All bits to the left of j are 1s
        int b = (1 << i) - 1; // All bits to the right of i are 1s
        int mask = a | b; // Combine both masks
        return n & mask; // Clear bits from i to j
    }

    public static void main(String[] args) {
        int number = 10;
        int start = 2; 
        int end = 4; 
        int result = clearRangeOfBits(number, start, end);
        System.out.println("Number after clearing bits from " + start + " to " + end + ": " + result); 
    }
}
