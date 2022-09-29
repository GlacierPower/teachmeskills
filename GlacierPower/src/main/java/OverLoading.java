public class OverLoading {
    public static void main(String[] args) {
        Friend Alex = new Friend("Alex",20,"25.06.1998");
        Friend Max = new Friend("Max",25);
        Max.born();
        Alex.born();
    }
}
class Friend{
    private String name;
    private int age;
    private String birthday;

    public Friend(String name2, int age2, String birthday2){
        this.name=name2;
        this.age =age2;
        this.birthday=birthday2;

    }

    public Friend(String name2, int age2){
        this.name=name2;
        this.age =age2;
    }
    void born(){
        String congratulations ="";
        if (birthday==null||birthday.isEmpty()){
            congratulations="no birthday";
        }else {
            congratulations=name+ " has birthday on " + birthday + " "+" he is "+age +" years old!";
        }
        System.out.println(congratulations);
    }
}