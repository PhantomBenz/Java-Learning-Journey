// considering only small letters
// for all types of character we will need to use HashSet data structure
public class l_RemoveDuplicateInString {
    public static void main(String[] args) {
        String s = new String("aaaabbbbbbccccdhasds");
        StringBuilder str = new StringBuilder();
        boolean map[] = new boolean[26];
        remDup(s,0,map,str);
    }
    public static void remDup(String s, int i, boolean map[], StringBuilder str){
        if(i == s.length()){
            System.out.println(str);
            return;
        }
        int idx = s.charAt(i)-'a';
        if(!map[idx]){
            map[idx] = true;
            str.append(s.charAt(i));
        }
        remDup(s,i+1,map,str);
    }
}
