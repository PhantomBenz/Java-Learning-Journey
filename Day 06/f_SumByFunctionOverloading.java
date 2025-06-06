public class f_SumByFunctionOverloading {
    public static int Sum(int a, int b) {
        return a + b;
    }

    public static int Sum(int a, int b, int c) {
        return a + b + c;
    }

    public static String Sum(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        int TwoSum = Sum(5, 10);
        int ThreeSum = Sum(5, 10, 10);

        System.out.println("Integer sum: " + TwoSum);
        System.out.println("Double sum: " + ThreeSum);
    }
}
