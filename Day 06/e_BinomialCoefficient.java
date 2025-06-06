public class e_BinomialCoefficient {
    public static int CalculateFactorial(int n) {
        for (int i = n - 1; i > 0; i--) {
            n *= i; 
        }
        return n;
    }
    public static int BinomialCoefficient(int n, int r) {
        int nominator = CalculateFactorial(n);
        int denominator = CalculateFactorial(r) * CalculateFactorial(n - r);
        return nominator / denominator; 
    }
    public static void main(String[] args) {
        int n = 5; 
        int r = 2; 
        int result = BinomialCoefficient(n, r);
        System.out.println(n + "C" + r + " : " + result);
    }
}
