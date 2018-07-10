package t7;

import t5.ThreadA;

public class Task {
    public void doLongTask() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            System.out.println("nosynochronized threadName=" + Thread.currentThread().getName() + "i =" + i);
            Thread.sleep(50);
        }
        System.out.println();
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                System.out.println("synochronized threadName="+Thread.currentThread().getName()+"i= "+i);
                Thread.sleep(50);
            }
        }
    }
}
