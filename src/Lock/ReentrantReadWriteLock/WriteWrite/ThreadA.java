package Lock.ReentrantReadWriteLock.WriteWrite;

public class ThreadA extends Thread {
    private WriteWrite w;

    //构造函数
    public ThreadA(WriteWrite w) {
        this.w = w;
    }

    @Override
    public void run() {
        w.write();
    }
}
