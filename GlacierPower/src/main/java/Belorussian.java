public class Belorussian extends Human {
    public static void main(String[] args) {
    Belorussian belorussian = new Belorussian();
    belorussian.speakLanguage();
    German german = new German();
    german.speakLanguage();
    }

    @Override
    void speakLanguage() {
        System.out.println("Belorussian speaks language");
    }
}
abstract class Human{
    abstract void speakLanguage();
}
    class German extends Human{

    @Override
    void speakLanguage() {

        System.out.println("Speak german language");
    }
}
