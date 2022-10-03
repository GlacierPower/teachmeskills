public class InterfaceAndAbstraction {
    public static void main(String[] args) {

    }
}

abstract class Bird2{
    abstract void walk();
}
class Pigeon extends Bird2 implements IFly{

    @Override
    void walk() {

    }

    @Override
    public void fly() {

    }
}
class Raven extends Bird2 implements IFly {

    @Override
    void walk() {

    }

    @Override
    public void fly() {

    }
}
class Penguin extends Bird2{

    @Override
    void walk() {

    }
}

interface IFly{
    void fly();
}