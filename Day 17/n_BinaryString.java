// print all binary stings of size N without consecutive ones.
public class n_BinaryString {
    public static void main(String[] args) {
        nonCons(3,0,"");
    }
    public static void nonCons(int n, int i, String s){
        if(i == n){
            System.out.println(s);
            return;
        }
        if(i == 0 || s.charAt(i-1) == '0'){
            nonCons(n,i+1,s+"0");
            nonCons(n,i+1,s+"1");
        }
        else{
            nonCons(n,i+1,s+"0");
        }
    }
}
