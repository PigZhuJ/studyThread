package Lock.USeConditionWaitNotifyError;

public class ThreadA extends Thread {
    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        try {
            service.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
