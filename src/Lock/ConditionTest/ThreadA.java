package Lock.ConditionTest;

import Lock.ConditionTestMoreMethod.MyService;

public class ThreadA extends Thread {
    private MyServices service;

    public ThreadA(MyServices service) {
        this.service = service;
    }

    @Override
    public void run() {
        for (int i = 0; i <Integer.MAX_VALUE ; i++) {
            try {
                service.set();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
