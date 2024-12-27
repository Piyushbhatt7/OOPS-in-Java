
class Account {
    public String name;
    protected String email;
}
public class Bank {
    public static void main(String[] args) {
        Account ac1 = new  Account();
        ac1.name = "Pussy";
        System.out.println(ac1.name);
        ac1.email = "pussy345@gmail.com";
        
    }
}
