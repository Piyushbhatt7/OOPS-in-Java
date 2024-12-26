// class Pen{

//     String color;
//     String type; // balllpoint , gelpoint

//     public void write(){
//         System.out.println("Writing somthing..");
//     }

//     public void printcolor(){
//         System.out.println(this.color);
//     }
// }

class Student {
      
    String name;
    int age;

    public void name(){

        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class OOPS {
          
    public static void main(String[] args) {
        
        // Pen pen1 = new Pen();
        // pen1.color = "Blue";
        // pen1.type = "Ballpoint";

        // Pen pen2 = new Pen();
        // pen2.color = "Red";
        // pen2.type = "Gelpoint";
        // pen1.write();

        Student stu = new Student();
        stu.name = "Piyush";
        stu.age = 20;
        stu.name();

        // pen1.printcolor();
        // pen2.printcolor();
    }
    
}