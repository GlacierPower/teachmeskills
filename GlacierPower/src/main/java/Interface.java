public class Interface implements IAuth {
static boolean isUserLogin = false;

    @Override
    public void login() {
        isUserLogin = true;
        System.out.println("User logged in");
    }

    @Override
    public void logout() {
        isUserLogin= false;
        System.out.println("User logged out");
    }

    public static void main(String[] args) {
        Interface inter = new Interface();
        if(!isUserLogin) inter.login();
        inter.login();
        inter.logout();
    }
}
interface IAuth{
    void login();
    void logout();
}