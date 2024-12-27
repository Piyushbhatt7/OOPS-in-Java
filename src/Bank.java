
class Account {
    public String name;
    protected String email;
    private String password;

    // getters & setters        // get the vale and to set the value

    public String getPassword(){
        return this.password;
    }

    public String setPassword(String pass){
        this.password = pass;
    }
}
public class Bank {
    public static void main(String[] args) {
        Account ac1 = new  Account();
        ac1.name = "Pussy";
        System.out.println(ac1.name);
        ac1.email = "pussy345@gmail.com";
        System.out.println(ac1.email);
       //  ac1.password = "pppss";    // can't access the private

    }
}
