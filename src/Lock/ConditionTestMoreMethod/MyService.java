package Lock.ConditionTestMoreMethod;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock=new ReentrantLock();
    public void methodA() throws InterruptedException {
        try {
            lock.lock();
            System.out.println("MethodA begin ThreadName: " + Thread.currentThread().getName() + " Time : " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("MethodA end ThreadName: " + Thread.currentThread().getName() + " Time : " + System.currentTimeMillis());
        }finally {
            System.out.println("excute the unlock!");
            lock.unlock();
        }
    }
    public void methodB() throws InterruptedException {
        try {
            lock.lock();
            System.out.println("MethodB begin ThreadName: " + Thread.currentThread().getName() + " Time : " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("MethodB end ThreadName: " + Thread.currentThread().getName() + " Time : " + System.currentTimeMillis());
        }finally {
            System.out.println("excute the unlock!");
            lock.unlock();
        }
    }
}
