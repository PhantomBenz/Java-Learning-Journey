public class a_IfElse {
    public static void main(String[] args) {
        int age = 16;
        if (age >= 18) {
            System.out.println("You are an adult.");//executes if age is greater than equal to 18
        } else {
            System.out.println("You are a minor.");//executes if age is not greater than equal to 18
        }

        if (age > 13 && age < 18) {
            System.out.println("You are a teenager.");//executes if age is greater than 13 and less than 18
        } 
        else {
            System.out.println("You are not a teenager or young adult.");//executes if none of the above conditions are met
        }
    }
}
