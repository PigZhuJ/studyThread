package Lock.ReentrantReadWriteLock.WriteWrite;

public class Run {
    public static void main(String[] args) {
        WriteWrite w=new WriteWrite();
        new ThreadA(w).start();
        new ThreadB(w).start();
    }
}
