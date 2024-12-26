class  Student{
       
    String name;
    int age;

    Student(){                     // constructor declaration same as class name   { DEFAULT constructor }
        System.out.println("constructor called");     
    }

//    Student(String name, int age){   // { PARAMETERIZED constructor}
//         this.name = name;
//         this.age = age;
//         System.out.println(name + " " + age);
//    }

     Student(Student obj1){

        this.name = obj1.name;
        this.age = obj1.age;
        System.out.println(name + " " + age);
     }
}

public class constructor {
    
    public static void main(String[] args) {
        //Student obj = new Student();   // constructor call when object declared     { DEFAULT constructor }

        // Student obj = new Student("Piyush", 20);   // { PARAMETERIZED constructor}

        Student obj = new Student();
        obj.name = "Piyush";
        obj.age = 20;
 
    Student obj1 = new Student(obj);


    }
}
