class Shape {

    public void area(){
        System.out.println("Display area");
    }
}

class Triangle extends Shape{
          public void area(int legth, int height){
              System.out.println(1/2*legth*height);
          }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Triangle obj = new Triangle();
        obj.area();
        
    }
}
