public class InnerClass {
    private String  privateVar ="Hello";
    String publicVar="HELLO";
    static String staticVar= "Bye";
    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        innerClass.callInnerClass();
    }
    void callInnerClass(){
        InnerClasses innerClasses =new InnerClasses();
        System.out.println(innerClasses.innerAge);


    }
    void callNestedClass(){
        NestedClass  nestedClass =new NestedClass();
        System.out.println(nestedClass.nestedAge);
//            innerClasses.callOuterClassVariable();

    }
    class InnerClasses{
        int innerAge = 18;
        void callOuterClassVariable(){
            System.out.println(privateVar);
            System.out.println(publicVar);
            System.out.println(staticVar);
        }
    }
    static class NestedClass{
         int nestedAge = 18;
        void callOuterClassVariable(){
            //System.out.println(private);
            //System.out.println(public);
            System.out.println(staticVar);
        }
    }
}
