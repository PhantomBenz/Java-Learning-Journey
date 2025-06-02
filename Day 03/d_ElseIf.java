public class d_ElseIf {
    public static void main(String[] args) {
        int age = 13;
        if (age>=18) {
            System.out.println("You are an adult."); // executes if age is greater than or equal to 18
        }
        else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager."); // executes if age is between 13 and 17
        }
        else {
            System.out.println("Invalid age."); // executes if none of the above conditions are met
        }
    }
}
