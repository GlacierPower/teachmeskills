public class SynchronizedPart2 {
    public static void main(String[] args) {
        CountThreadPart2 countThreadPart2 = new CountThreadPart2();

        Thread thread = new Thread(countThreadPart2);
        thread.start();

        Thread thread1 = new Thread(countThreadPart2);
        thread1.start();
    }
}

class CountThreadPart2 implements Runnable {

    private int count = 0;

    synchronized void changeValue() {
        for (int i = 0; i < 10; i++) {
            count++; // c
            System.out.print(count + " ");
        }

    }

    @Override
    public void run() {
        changeValue();
    }
}

