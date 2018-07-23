package Lock.ReentrantLockTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock=new ReentrantLock();
    public void testMethod(){
        lock.lock();
        for (int i = 0; i < 10; i++) {
            System.out.println("ThreadName:"+Thread.currentThread().getName()+"----"+i);
        }
        lock.unlock();
    }
}
