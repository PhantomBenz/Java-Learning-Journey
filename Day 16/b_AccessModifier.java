public class b_AccessModifier {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.username = "user123"; 
        // account.password = "pass123"; This line will cause an error because password is private
        account.setPassword("password123");
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }

    public String getPassword() {
        return password;
    }
}
