package waitandnotify.size5;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Object obj=new Object();
        ThreadA ta=new ThreadA(obj);
        ta.start();
        Thread.sleep(50);
        ThreadB tb=new ThreadB(obj);
        tb.start();
    }
}
