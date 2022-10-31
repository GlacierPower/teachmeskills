public class SecondFlow {
    public static void main(String[] args) {
        ThreadClass3 threadClass3 =new ThreadClass3(){
            @Override
            public void run() {
                System.out.println("Run in Thread in anoym class");
            }
        };
        threadClass3.start();
        // third way to create a flow
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("I'm running in Thread");
            }
        };
        thread.start();

        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm running in Runnable");
            }
        };
        Thread thread1= new Thread(runnable);
        thread1.start();
    }

}
class ThreadClass3 extends Thread{
    @Override
    public void run() {
        System.out.println("I'm running in Thread");
    }
}

class ThreadClass4 implements Runnable{

    @Override
    public void run() {
        System.out.println("I'm running in Runnable");
    }
}
