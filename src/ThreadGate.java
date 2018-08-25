import sun.util.locale.provider.FallbackLocaleProviderAdapter;

import java.util.concurrent.locks.Lock;

public class ThreadGate {
    private boolean isOpen;
    private int generation;

    public synchronized void close() {
        isOpen=false;
    }

    public synchronized void open() {
        ++generation;
        isOpen=true;
        notifyAll();
    }

    public synchronized void await() throws InterruptedException {
        int arrivalGeneration = generation;
        while (!isOpen && arrivalGeneration == generation)
            wait();
    }

}
