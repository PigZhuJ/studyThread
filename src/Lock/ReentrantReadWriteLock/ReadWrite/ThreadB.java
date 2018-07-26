package Lock.ReentrantReadWriteLock.ReadWrite;

public class ThreadB extends Thread {
    private readWrite s;

    public ThreadB(readWrite s) {
        this.s = s;
    }

    @Override
    public void run() {
        s.write();
    }
}
