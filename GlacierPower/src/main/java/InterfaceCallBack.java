public class InterfaceCallBack {
    public static void main(String[] args) {
        Button Login = new Button(new LoginClickListener());
        Login.buttonClicked();
    }
}
class LoginClickListener implements  ILogin{

    @Override
    public void sendLoginRequest() {
        System.out.println("Login request was successfully sent...");
    }
}
interface ILogin{ // создание интерфейса
    void  sendLoginRequest();
}
class Button{ // создание класса кнопки

    ILogin iLogin; //  создаём пепеменную типа ILogin
    public Button(ILogin action){ //  контруктор кнопки с переменной типа ILogin
        this.iLogin = action; // получает значение объекта (проинициализировали)
    }
    void buttonClicked(){ // метод отправляющий запрос
        iLogin.sendLoginRequest();
    }
}
