package Lock.UseMoreCondition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyServices {
    private Lock lock=new ReentrantLock();
    private Condition conditionA=lock.newCondition();
    private Condition conditionB=lock.newCondition();
    public void awaitA(){
        try{
            lock.lock();
            System.out.println("A开始了： "+System.currentTimeMillis());
            conditionA.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void awaitB(){
        try{
            lock.lock();
            System.out.println("B开始了： "+System.currentTimeMillis());
            conditionB.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void signalAll_A(){
        try {
            lock.lock();
            System.out.println("A结束了： "+System.currentTimeMillis());
            conditionA.signalAll();
        }finally {
            lock.unlock();
        }
    }
    public void signalAll_B(){
        try {
            lock.lock();
            System.out.println("B结束了： "+System.currentTimeMillis());
            conditionB.signalAll();
        }finally {
            lock.unlock();
            System.out.println("B释放了锁");
        }
    }
}
