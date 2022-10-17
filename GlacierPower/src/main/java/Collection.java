import java.util.ArrayList;


public class Collection {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Hello");
        arrayList.add("Bye");
        arrayList.add("World");


        System.out.println(arrayList.indexOf("Bye"));
        arrayList.add(1,"Hi");
        System.out.println(arrayList.indexOf("Bye"));
    }
}