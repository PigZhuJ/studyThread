package Lock.ReentrantReadWriteLock.ReadWrite;

public class ThreadA extends Thread {
    private readWrite s;

    public ThreadA(readWrite s) {
        this.s = s;
    }

    @Override
    public void run() {
        s.read();
    }
}
