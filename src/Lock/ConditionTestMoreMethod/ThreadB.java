package Lock.ConditionTestMoreMethod;

public class ThreadB extends Thread{
    private MyService service;

    public ThreadB(MyService service) {
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

