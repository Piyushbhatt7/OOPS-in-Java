
class Shape {

    public void area() {
        System.out.println("Display area");
    }
}

class Triangle extends Shape {

    public double area(int legth, int height) {
        return 0.5 * legth * height;
    }
}

public class SingleInheritance {

    public static void main(String[] args) {
        Triangle obj = new Triangle();
        obj.area();
        System.out.println("Area: " + obj.area(12, 18));

    }
}
