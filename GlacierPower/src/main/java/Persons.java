import java.util.Objects;

public class Persons {


    public static void main(String[] args) {
    Person person1 = new Person("Diana");
    Person person2 = new Person("Zhenya");
    Person person3 = new Person("Diana");

    System.out.println(person1.equals(person1));
        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));

    System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());
    }
}
class Person extends Persons{
    String name;
    public Person(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) { //переопределение equals and hashCode
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
