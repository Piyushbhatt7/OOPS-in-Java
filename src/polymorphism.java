class myclass {
    public String name;
    public int age;

    public void info(int age){
        System.out.println(age);
    }

    public void info(String name) {
        System.out.println(name);
    }

    public void info(String name, int age){
         System.out.println(name + " " + age);
    }
}



public class polymorphism {
    
    public static void main(String[] args) {
        myclass obj = new myclass();
        obj.name = "Piyush";
        obj.age = 21;

        obj.info(obj.name, obj.age);
    }

}
