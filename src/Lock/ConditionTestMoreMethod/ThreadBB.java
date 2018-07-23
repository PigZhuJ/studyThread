package Lock.ConditionTestMoreMethod;

public class ThreadBB extends Thread{
    private MyService service;

    public ThreadBB(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        try {
            service.methodB();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
