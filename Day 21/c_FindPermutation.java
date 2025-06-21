public class c_FindPermutation {
    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str,"");
    }
    public static void findPermutation(String str, String ans){
        // Base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        // Recursive case
        for(int i = 0; i < str.length(); i++){
            char curr = str.charAt(i);
            findPermutation(str.substring(0, i) + str.substring(i+1), ans+curr);
        }
    }
} // TC = O(n * n!)
