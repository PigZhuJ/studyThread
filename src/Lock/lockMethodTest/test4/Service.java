package Lock.lockMethodTest.test4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * hasQueuedThread(Thread thread) 查询指定的线程是否正在等待获取此锁定。
 * hasQueuedThreads() 查询是否有线程获取此锁定
 */
public class Service {
    public ReentrantLock lock=new ReentrantLock();
    public void waitMethod(){
        try {
            lock.lock();
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
