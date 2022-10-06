public class Lesson7 {

    static IRepository iRepository = new RepositoryImpl();
    public static void main(String[] args) {
        iRepository= new RepositoryImpl();
        iRepository.login("name", "11456156");

        Shop zara = Shop.CLOSE;
        switch (zara){
            case OPEN:
                System.out.println("Zara is open");
            case CLOSE:
                System.out.println("Zara is closed");
        }

    }
}

enum Shop{
    OPEN,
    CLOSE
}
