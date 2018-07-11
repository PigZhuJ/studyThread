package waitandnotify.notifyOne;

public class TestRun {
    public static void main(String[] args) throws InterruptedException {
        Object obj=new Object();
        ThreadA ta=new ThreadA(obj);
        ta.start();
        ThreadB tb=new ThreadB(obj);
        tb.start();
        ThreadC tc=new ThreadC(obj);
        tc.start();
        Thread.sleep(1000);
        NotifyThreada nt=new NotifyThreada(obj);
        nt.start();
    }
}
