package waitandnotify.notifyOne;

public class NotifyThreada extends Thread {
    private Object obj;

    public NotifyThreada(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        synchronized (obj){
//            obj.notify();
//            obj.notify();
//            obj.notify();
//            obj.notify();
            obj.notifyAll();
        }
    }
}
