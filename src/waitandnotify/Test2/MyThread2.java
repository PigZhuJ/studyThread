package waitandnotify.Test2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread2 extends Thread {
    private Object lock;

    public MyThread2(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("------notify()方法执行前；" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis())) + "-------");
            lock.notify();
            System.out.println("------notify()方法执行后；" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis())) + "-------");
        }
    }
}
