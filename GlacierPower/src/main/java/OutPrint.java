import java.util.ArrayList;
import java.util.function.Consumer;

public class OutPrint {
    static Consumer<String> printUpperCase = str -> {
        System.out.print(str.toUpperCase()+" ");//next level coding
    };

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("Nikola"));
        users.add(new User("Oleg"));
        users.add(new User("Max"));
        users.add(new User("Anton"));
        users.add(new User("Zina"));

//        for (User user : users){
//            System.out.println(user);
//        }
        users.stream().map(User::getName).forEach((n) -> {
            System.out.print(n + " ");
        });

        users.stream().map(User::getName).forEach(printUpperCase);


    }
}

class User {
    private String name;

    User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return
                name;
    }
}
