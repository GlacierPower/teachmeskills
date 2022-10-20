import java.util.ArrayList;
import java.util.Iterator;

public class IterableColl {
    public static void main(String[] args) {
        ArrayList <String>arrayList = new ArrayList();
        arrayList.add("one");
        arrayList.add("five");
        arrayList.add("three");
        arrayList.add("four");
        arrayList.add("two");

        Integer index = arrayList.indexOf(3);
        arrayList.remove(index);
        System.out.print(arrayList+" ");

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}
