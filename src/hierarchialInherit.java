class Shape {

    public void area(){
        System.out.println("Display area");
    }
}

class Triangle extends Shape{
          public double area(int legth, int height){
            System.out.println("Triangle");
              return 0.5 * legth * height;
          }
}


class Circle extends Shape {
          
    public double  area(int length, int height){
        System.out.println("EquilateralTriangle");
             return 0.5 * length * height;
    }
}




public class hierarchialInherit {
    public static void main(String[] args) {
        
    }
}
