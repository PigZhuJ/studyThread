package waitandnotify.waitReleaseLock;

public class ThreadA extends Thread{
    private Object obj;

    public ThreadA(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        Service s=new Service();
        try {
            s.TestMethod(obj);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
