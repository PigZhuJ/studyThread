package waitandnotify.waitAndInterrupt;

public class TestThread extends Thread {
    private Object obj;

    public TestThread(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        waitInterrupt wi=new waitInterrupt();
        try {
            wi.testMethod(obj);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
