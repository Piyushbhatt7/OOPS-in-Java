class Pen{

    String color;
    String type; // balllpoint , gelpoint

    public void write(){
        System.out.println("Writing somthing..");
    }

    public void printcolor(){
        System.out.println(this.color);
    }
}

public class OOPS {
          
    public static void main(String[] args) {
        
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Ballpoint";

        Pen pen2 = new Pen();
        pen2.color = "Red";
        pen2.type = "Gelpoint";
        pen1.write();

        pen1.printcolor();
        pen2.printcolor();
    }
    
}