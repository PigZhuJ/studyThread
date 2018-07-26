package Lock.ReentrantReadWriteLock.ReadRead;

public class Run {
    public static void main(String[] args) {
        ReadRead r=new ReadRead();
        new ThreadA(r).start();
        new ThreadB(r).start();
    }
}
