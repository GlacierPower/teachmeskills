import java.util.HashSet;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetsAndHashSet {
    public static void main(String[] args) {
        SortedSet sortedSet = new TreeSet();
        sortedSet.add("banana");
        sortedSet.add("apple");
        sortedSet.add("orange");
        sortedSet.add("banana");

        System.out.println(sortedSet);

        HashSet hashSet= new HashSet();
        hashSet.add(new Student("Olya"));
        hashSet.add(new Student("Olya"));
        hashSet.add(new Student("Masha"));
        hashSet.add(new Student("Sasha"));


        System.out.println(hashSet.size());

    }
}
class Student{
    private String name;
    Student(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}