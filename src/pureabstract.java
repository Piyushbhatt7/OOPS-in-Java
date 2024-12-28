interface Animal {

    public void walk();
                                      // can't use non abstract function
}

class Horse implements Animal{
    public void walk() {
         System.out.println("Walks on 5 legs");
    }
}

public class pureabstract {
    public static void main(String[] args) {
        
    }
}
