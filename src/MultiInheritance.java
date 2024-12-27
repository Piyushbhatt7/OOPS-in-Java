class Shape {

    public void area(){
        System.out.println("Display area");
    }
}

class Triangle extends Shape{
          public double area(int legth, int height){
              return 0.5 * legth * height;
          }
}


class EquilateralTriangle extends Triangle {
          
    public double  area(int length, int height){
             return 0.5 * length * height;
    }
}




public class MultiInheritance {
    public static void main(String[] args) {
        
    }
}
