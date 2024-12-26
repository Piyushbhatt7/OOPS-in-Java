class  Student{
       
    String name;
    int age;

    // Student(){                     // constructor declaration same as class name   { DEFAULT constructor }
    //     System.out.println("constructor called");     
    // }

   Student(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println(name + " " + age);
   }
}

public class constructor {
    
    public static void main(String[] args) {
        //Student obj = new Student();   // constructor call when object declared  

        Student obj = new Student("Piyush", 20);
    }
}
