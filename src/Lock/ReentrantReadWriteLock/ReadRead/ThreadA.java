package Lock.ReentrantReadWriteLock.ReadRead;

public class ThreadA extends Thread {
    private ReadRead r;

    //构造函数
    public ThreadA(ReadRead r) {
        this.r = r;
    }

    @Override
    public void run() {
        r.read();
    }
}
