package Lock.ConditionTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 生产者消费者队列
 */
public class MyServices {
    private Lock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();
    private boolean hasValue=false;

    /**
     * set方法
     */
    public void set() throws InterruptedException {
        try {
            lock.lock();
            while (hasValue == true) {
                condition.await();
            }
            System.out.println("打印*");
            hasValue = true;
            condition.signal();
        }finally {
            lock.unlock();
            System.out.println("锁释放了！");
        }
    }

    public void get() throws InterruptedException {
        try{
            lock.lock();
            while (hasValue==false){
                condition.await();
            }
            System.out.println("打印%");
            hasValue=false;
            condition.signal();
        }finally {
            lock.unlock();
            System.out.println("锁释放了");
        }
    }
}
