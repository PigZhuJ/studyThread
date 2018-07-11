package waitandnotify.waitAndInterrupt;

public class TestRun {
    public static void main(String[] args) throws InterruptedException {
        Object obj=new Object();
        TestThread tt=new TestThread(obj);
        tt.start();
        Thread.sleep(5000);
        tt.interrupt();
    }
}
