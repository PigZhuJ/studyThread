package Lock.ReentrantReadWriteLock.WriteWrite;

public class ThreadB extends Thread {
    private WriteWrite w;

    public ThreadB(WriteWrite w) {
        this.w = w;
    }

    @Override
    public void run() {
        w.write();
    }
}
