package Lock.ReentrantReadWriteLock.ReadRead;

public class ThreadB extends Thread {
    private ReadRead r;

    public ThreadB(ReadRead r) {
        this.r = r;
    }

    @Override
    public void run() {
        r.read();
    }
}
