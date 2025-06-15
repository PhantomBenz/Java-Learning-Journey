public class d_SetIthBit {
    public static int setIthBit(int n, int i) {
        return n | (1 << i); // Set the ith bit to 1
    }

    public static void main(String[] args) {
        int number = 5; 
        int index = 1; 
        int result = setIthBit(number, index);
        System.out.println("Number after setting " + index + "th bit: " + result); 
    }
}
