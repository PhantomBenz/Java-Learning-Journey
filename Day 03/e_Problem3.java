// Calculate income tax based on income brackets 
// income < 5L : 0% tax
// income >= 5L and < 10L : 20% tax
// income >= 10L and < 20L : 30% tax
public class e_Problem3 {
    public static void main(String[] args) {
        int income = 1500000; // Example income
        double tax = 0;

        if (income < 500000) {
            tax = 0; // No tax for income less than 5L
        } 
        else if (income >= 500000 && income < 1000000) {
            tax = income * 0.20; // 20% tax for income between 5L and 10L
        } 
        else if (income >= 1000000 && income < 2000000) {
            tax = income * 0.30; // 30% tax for income between 10L and 20L
        } 
        else {
            System.out.println("Invalid income"); // if none of the above conditions are met
        }
        System.out.println("Your income tax is: " + tax); // Print the calculated tax
    }
}
