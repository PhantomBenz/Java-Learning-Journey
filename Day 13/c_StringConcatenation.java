public class c_StringConcatenation {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        
        String result1 = str1 + " " + str2;
        System.out.println("Concatenation using +: " + result1);
        
        String result2 = str1.concat(" ").concat(str2);
        System.out.println("Concatenation using concat(): " + result2);
        
        StringBuilder sb = new StringBuilder();
        sb.append(str1).append(" ").append(str2);
        String result3 = sb.toString();
        System.out.println("Concatenation using StringBuilder: " + result3);
    }
}
