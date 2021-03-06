package Lock.UseConditionWaitNotifyRight;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await() {
        try {
            lock.lock();
            System.out.println("await的时间 ：" + System.currentTimeMillis());
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("锁释放了");
            lock.unlock();
        }
    }

    public void signal() {
        try {
            lock.lock();
            System.out.println("signal的时间 ： " + System.currentTimeMillis());
            condition.signal();
        } finally {
            lock.unlock();
        }
    }
}
