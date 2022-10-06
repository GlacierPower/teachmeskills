import java.io.PrintStream;

public class Lesson7_3 {
    public static void main(String[] args) {
    Parent parent = new Parent();
    Mum mum = new Mum();
    checkType(mum);
    Lesson7_3 name = new Lesson7_3();
    System.out.println(name.getName(""));

    }

     String getName(String name){
        if(name.isEmpty()){
            return "Name can't be empty";
        }
        return name;
    }

    static void checkType(Object object){
        if (object instanceof Parent){// check type of object
            ((Parent) object).walk();
        }
        else {
            System.out.println("Not parent");
        }
    }


}
class Parent{
    void walk(){
        System.out.println("parent walks");
    }
}
class Dad extends Parent {
    void walk() {
        System.out.println("dad walks");
    }
}
class Mum extends Parent {
    void walk() {
        System.out.println("mum walks");
    }
    void sleep(){
        System.out.println("Mum is sleeping");
    }
}
