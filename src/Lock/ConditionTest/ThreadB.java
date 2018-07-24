package Lock.ConditionTest;

public class ThreadB extends  Thread {
    private MyServices services;

    public ThreadB(MyServices services) {
        this.services = services;
    }
    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            try {
                services.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
