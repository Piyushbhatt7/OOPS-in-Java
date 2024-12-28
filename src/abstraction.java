abstract  class Animal{

    abstract  void walk();         // abstract function
}

class Horse extends Animal {
    public void walk(){

        System.out.println("Walk on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}


public class abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        
        Chicken ch = new Chicken();
        ch.walk();

        
    }
}
