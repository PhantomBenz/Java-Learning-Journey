public class g_SumByFunctionOverloading2 {
    public static int Sum(int a, int b) {
        return a + b;
    }

    public static float Sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        int IntSum = Sum(5, 10);
        Float FloatSum = Sum( 10.2f, 10.0f);

        System.out.println("Integer sum: " + IntSum);
        System.out.println("Triple integer sum: " + FloatSum);
    }
}
