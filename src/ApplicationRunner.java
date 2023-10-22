import java.util.ArrayList;
import java.util.List;

public class ApplicationRunner {
    public static void main(String[] args) throws InterruptedException {

        List<Runnable> threads = new ArrayList<>();
        threads.add(new Channel());
        threads.add(new Channel());
        threads.add(new Channel());
        threads.add(new Channel());
        threads.add(new Channel());

        for(Runnable runnable : threads) {
            new Thread(runnable).start();
        }

        Thread.sleep(10000);
    }
}