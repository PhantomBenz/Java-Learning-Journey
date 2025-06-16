public class f_MethodOverloading {
    public static void main(String[] args) {
        calculate calc = new calculate();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum(1,2,3));
        System.out.println(calc.sum(1,2,3,4));
    }    
}

class calculate {
    int sum(int a, int b) {
        return a + b;
    }
    
    int sum(int a, int b, int c) {
        return a + b + c;
    }
    
    int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
