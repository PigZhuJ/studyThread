package Lock.lockMethodTest.test5;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
    public ReentrantLock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();
    public void waitMethod(){
        try{
            lock.lock();
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void notifyMethod(){
        try{
            lock.lock();
            System.out.println(lock.hasWaiters(condition)+" "+lock.getWaitQueueLength(condition));
            condition.signal();
        }finally {
            lock.unlock();
        }
    }
}
