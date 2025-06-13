public class d_StringCharAt {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        char firstChar = str.charAt(0); // 'H'
        char fifthChar = str.charAt(4);  // 'o'
        char lastChar = str.charAt(str.length() - 1); // '!'
        
        System.out.println("First character: " + firstChar);
        System.out.println("Fifth character: " + fifthChar);
        System.out.println("Last character: " + lastChar);
    }
}
