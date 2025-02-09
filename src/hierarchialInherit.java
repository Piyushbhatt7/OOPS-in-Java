
class Shape {

    public void area() {
        System.out.println("Display area");
    }
}

class Triangle extends Shape {

    public double area(int length, int height) {
        System.out.println("Triangle");
        return 0.5 * length * height;
    }
}

class Circle extends Shape {

    public double area(int r) {
        System.out.println("Circle");
        return (3.14) * r * r;
    }
}

public class hierarchialInherit {

    public static void main(String[] args) {

        Triangle tr1 = new Triangle();
        System.out.println(tr1.area(12, 1));

        Circle cr = new Circle();
        System.out.println(cr.area(2));
    }
}
