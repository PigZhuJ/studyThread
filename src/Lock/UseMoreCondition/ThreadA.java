package Lock.UseMoreCondition;

public class ThreadA extends Thread {
    private MyServices services;

    public ThreadA(MyServices services) {
        this.services = services;
    }

    @Override
    public void run() {
        services.awaitA();
    }
}
