
public class Channel implements Runnable {

    /**
     * Add javadoc for this method
     * Updated javadoc for this method
     */
    @Override
    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
    }
}