public class b_FindSubset {
    public static void main(String[] args) {
        String str = "abc";
        findsubsets(str,"", 0);
    }
    public static void findsubsets(String str,String ans, int i){
        // base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("Null");
                return;
            }
            System.out.println(ans);
            return;
        }
        // recursion
        // Yes choice
        findsubsets(str, ans+str.charAt(i), i+1);
        // No choice
        findsubsets(str, ans, i+1);
    } 
} // TC = O(n * 2^n)
