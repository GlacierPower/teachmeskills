public class AnonymClass {
    static IRepository iRepository=new IRepository() {
      //анонимный класс с интерфейсом
        @Override
        public void login(String userName, String password) {
            System.out.println("hello");
        }
    };//окончание анонимного класса

//    static Anonym anonym =new Anonym(){
//        @Override
//        void hackNetWork() {
//            super.hackNetWork();// parent behaviour
//            System.out.println("Child hacked the world");
//        }
//    };

    public static void main(String[] args) {
        Anonym anonym =new Anonym(){
            @Override
            void hackNetWork() {
                super.hackNetWork();// parent behaviour //local anonym class
                System.out.println("Child hacked the world");
            }
        };
    iRepository.login("chuha","546854");
    anonym.hackNetWork();
    }
}
class Anonym{
    void hackNetWork(){
        System.out.println("I hacked the world");
    }
}

