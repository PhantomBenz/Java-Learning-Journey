public class e_CheckPlaindrome {
    public static void main(String[] args) {
        String str = "racecar";
        Palindrome(str);
    }
    public static void Palindrome(String str){
        int n = str.length();
        for(int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                System.out.println("The string is not a palindrome.");
                return;
            }
        }
        System.out.println("The string is a palindrome.");
    }
}