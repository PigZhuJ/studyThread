package waitandnotify.waitReleaseLock;

public class Run {
    public static void main(String[] args) {
        Object obj=new Object();
        ThreadA ta=new ThreadA(obj);
        ta.start();
        ThreadB tb=new ThreadB(obj);
        tb.start();
    }
}
