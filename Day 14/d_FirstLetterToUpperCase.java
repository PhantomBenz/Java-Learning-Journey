public class d_FirstLetterToUpperCase {
    public static String firstLetterToUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        char firstChar = Character.toUpperCase(str.charAt(0)); 
        sb.append(firstChar);
        for(int i=1; i < str.length(); i++) {
            if(str.charAt(i) == ' ' && i < str.length() - 1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i))); // Capitalize the first letter after space
            }
            else {
                sb.append(str.charAt(i)); // Append the rest of the characters
            }
            
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + firstLetterToUpperCase(str));
    }
}
