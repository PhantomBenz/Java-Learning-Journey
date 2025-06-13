public class a_Strings {
    public static void main(String[] args) {
        char arr[] = {'a','b','c','d'};

        String str = "abcd";
        String str2 = new String("abcd");
        
        // String is IMMUTABLE


        System.out.println("str: " + str);
        System.out.println("str2: " + str2);
        System.out.println("arr: " + arr[0] + arr[1] + arr[2] + arr[3]);
    }
}