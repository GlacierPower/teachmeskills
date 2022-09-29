public class Child extends Parent {

    @Override
    void speak() {
        System.out.println("Child speaks loudly");
        super.speak();
    }

    public static void main(String[] args) {
        Parent child = new Child();
        Parent parent = new Parent();
        System.out.println("Parent eye color: " +parent.eye_color);
        child.eye_color="green";
        System.out.println("Child eye color: "+child.eye_color);
        child.speak();

    }
    void phone_number(int number){

    }
    void phone_number(int number, String mobile_operator){

    }
}
class Parent{

   protected String eye_color="blue";

   void speak(){
       System.out.println("I speak quietly");
   }

}

