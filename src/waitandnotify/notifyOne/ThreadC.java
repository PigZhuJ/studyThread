package waitandnotify.notifyOne;

public class ThreadC extends Thread {
    private Object object;

    public ThreadC(Object object) {
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
