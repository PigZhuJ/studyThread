package Lock.UseMoreCondition;


public class ThreadB extends Thread {
    private MyServices service;

    public ThreadB(MyServices service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitB();
    }
}
