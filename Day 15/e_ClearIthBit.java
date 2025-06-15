public class e_ClearIthBit {
    public static int clearIthBit(int n, int i) {
        return n & ~(1 << i); // Clear the ith bit (set it to 0)
    }

    public static void main(String[] args) {
        int number = 5; 
        int index = 2; 
        int result = clearIthBit(number, index);
        System.out.println("Number after clearing " + index + "th bit: " + result); 
    }
}
