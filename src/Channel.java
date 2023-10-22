
public class Channel implements Runnable {

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread name: " + threadName);
    }
}