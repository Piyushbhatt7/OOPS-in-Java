class Pen{

    String color;
    String type; // balllpoint , gelpoint

    public void write(){
        System.out.println("Writing somthing.somthing..");
    }
}

public class OOPS {
          
    public static void main(String[] args) {
        
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Ballpoint";
        pen1.write();
    }
    
}