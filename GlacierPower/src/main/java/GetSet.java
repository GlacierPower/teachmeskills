public class GetSet {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.setAge(14);
        shop.sellAlcohol();
    }
}

class Shop{

    private int age=0;
    // переменные должны быть приватные,
    // передаем церез конструктор и присваиваем через get для получения,
    // set для присвоения с каким то условием

    public void setAge(int age) {
        if (age>=18){ // если условие верно происходит инициализация переменной
            // возраст если она меняшь 18 не работает
            this.age = age;
        }
        else {
            System.out.println("You are a child: " + getAge());
        }
    }

    public int getAge() {
        return age;
    }

    void sellAlcohol(){
        if (age!=0){
            System.out.println("Vodka sold to "+ getAge());
        }
    }
}

