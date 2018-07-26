package Lock.lockMethodTest.test1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * test method :getHoldCount() ,获得保持锁的个数，也就是调用lock()方法的次数
 */
public class Service {
    private ReentrantLock lock=new ReentrantLock();
    public void testMethod1(){
        try {
            lock.lock();
            System.out.println("serviceMethod1 getHoldCount= "+lock.getHoldCount());
            testMethod2();
        }finally {
            System.out.println("方法1的锁释放了");
            lock.unlock();
        }
    }

    private void testMethod2() {
       try {
           lock.lock();
           System.out.println("serviceMethod1 getHoldCount= " + lock.getHoldCount());
       }finally {
           System.out.println("方法2的锁释放了");
           lock.unlock();
           System.out.println("释放后 getHoldCount= " + lock.getHoldCount());
       }
    }
}
