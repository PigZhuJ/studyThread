package Lock.ReentrantReadWriteLock.ReadWrite;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        readWrite s=new readWrite();
        new ThreadA(s).start();
        Thread.sleep(1000);
        new ThreadB(s).start();
    }
}
