import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class ArrayDeq {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("IOS developer");
        arrayDeque.addFirst("Android developer");
        arrayDeque.addLast("Python developer");
        arrayDeque.push("Flutter developer");// add in the beginning

        System.out.println(arrayDeque);
        System.out.println(arrayDeque.peek());
        Set set = new TreeSet();

        ArrayList arrayList = new ArrayList();
        arrayList.addAll(arrayDeque);
        System.out.print(arrayList.get(3));

    }
}
