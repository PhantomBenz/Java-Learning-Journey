public class c_GetIthBit {
    public static int getIthBit(int n, int i) {
        if(n<<i == 0) {
            return 0; // If the ith bit is 0
        } else {
            return 1; // If the ith bit is 1
        }
    }
    public static void main(String[] args) {
        System.out.println(getIthBit(5,0));
    }
}
