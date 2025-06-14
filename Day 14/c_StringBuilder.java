public class c_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char c = 'a'; c <= 'z'; c++) {
            sb.append(c);  // Appending characters to StringBuilder
        }
        System.out.println(sb);
    }
}
