public class e_StringCompression {
    public static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1));
                compressed.append(count);
                count = 1;
            }
        }
        compressed.append(str.charAt(str.length() - 1));
        compressed.append(count);

        return compressed.toString();
    }
    public static void main(String[] args) {
        String input = "aaabbcdddde";
        String compressed = compressString(input);
        System.out.println("Original String: " + input);
        System.out.println("Compressed String: " + compressed);
    }
}
