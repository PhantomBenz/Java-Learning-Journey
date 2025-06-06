public class c_Product {
    public static int CalculateProduct(int num1, int num2) { 
        int product = num1 * num2;
        return product;
    }

    public static void main(String[] args) {
        int a = 5; 
        int b = 10; 
        int product = CalculateProduct(a, b); 
        System.out.println("The product is : " + product);
        System.out.println("30 x 40 : " + CalculateProduct(30, 40)); 
    }
}
