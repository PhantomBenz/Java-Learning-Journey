public class a_Substring {
    public static String substring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "Hello, World!";
        int start = 7;
        int end = 12;
        System.out.println("Extracted substring using user-defined method: " + substring(str, start, end));
        System.out.println("Extracted substring using inbuilt method: " + str.substring(start, end));
    }
}
