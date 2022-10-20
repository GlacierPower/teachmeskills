import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorSort {
    public static void main(String[] args) {
        ArrayList<Pearson> arrayList = new ArrayList<Pearson>();
        arrayList.add(new Pearson("Sasha", 18));
        arrayList.add(new Pearson("Dima", 10));
        arrayList.add(new Pearson("Olya", 21));
        arrayList.add(new Pearson("Sasha", 25));
        arrayList.add(new Pearson("Masha", 32));

        ArrayList<String> arrayLists = new ArrayList<String>();
        arrayLists.add("Sasha");
        arrayLists.add("Masha");
        arrayLists.add("Olya");
        arrayLists.add("Dima");
        arrayLists.add("Anton");
        Collections.sort(arrayLists,Comparator.<String>naturalOrder());
        System.out.print(arrayLists);

        System.out.print(arrayList);
        Collections.sort(arrayList, new Comparator<Pearson>() {
            @Override
            public int compare(Pearson pearson, Pearson t1) {
                return String.valueOf(pearson.getName()).compareTo(String.valueOf(t1.getName()));
            }
        });

        for (Pearson pearson : arrayList) {
            System.out.println("\n" + pearson.getAge());
        }
    }
}

class Pearson {
    private String name;
    private int age;

    Pearson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
