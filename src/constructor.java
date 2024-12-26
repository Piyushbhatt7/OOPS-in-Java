class  Student{
       
    String name;
    int age;

    Student(){                     // constructor declaration same as class name
        System.out.println("constructor called");    
    }
}

public class constructor {
    
    public static void main(String[] args) {
        Student obj = new Student();
    }
}
