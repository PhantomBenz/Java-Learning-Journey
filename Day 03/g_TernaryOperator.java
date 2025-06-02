public class g_TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int largest = (a > b) ? a : b; // if a is greater than b, largest <- a else largest <- b

        System.out.println("Largest number : " + largest);
        System.out.println(a + " is " + (a % 2 == 0 ? "even" : "odd"));;
    }
}
