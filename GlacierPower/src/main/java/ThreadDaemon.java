public class ThreadDaemon {
    public static void main(String[] args) {

        ThreadClassDaemon threadClassDaemon = new ThreadClassDaemon();
        threadClassDaemon.setDaemon(true);
        threadClassDaemon.start();
    }
}

class ThreadClassDaemon extends Thread {
    @Override
    public void run() {
        System.out.println("I'm a daemon thread: "
                + Thread.currentThread().isDaemon());
    }
}