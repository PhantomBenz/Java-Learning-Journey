public class g_StringCompare {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "World";

        // Using equals() method
        boolean isEqual1 = str1.equals(str2); // true
        boolean isEqual2 = str1.equals(str3); // false

        // Using compareTo() method
        int comparison1 = str1.compareTo(str2); // 0 (equal)
        int comparison2 = str1.compareTo(str3); // negative value (str1 < str3)

        System.out.println("str1 equals str2: " + isEqual1);
        System.out.println("str1 equals str3: " + isEqual2);
        System.out.println("str1 compareTo str2: " + comparison1);
        System.out.println("str1 compareTo str3: " + comparison2);
    }
}
