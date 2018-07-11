package waitandnotify.notifyOne;

public class ThreadA extends Thread {
    private Object object;

    public ThreadA(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        Service s=new Service();
        try {
            s.testMethod(object);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
