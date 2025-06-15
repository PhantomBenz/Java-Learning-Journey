public class f_UpdateIthBit {
    public static int updateIthBit(int n, int i, int bitValue) {
        if (bitValue == 0) {
            return n & ~(1 << i); 
        } else {
            return n | (1 << i); 
        }
    }

    public static void main(String[] args) {
        int number = 5; 
        int index = 1; 
        int newBitValue = 0; 
        int result = updateIthBit(number, index, newBitValue);
        System.out.println("Number after updating " + index + "th bit: " + result); 
    }
}
