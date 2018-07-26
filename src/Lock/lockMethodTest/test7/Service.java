package Lock.lockMethodTest.test7;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 查询当前线程是否保持此锁定
 * isHeldByCurrentThread()方法
 */
public class Service {
    private ReentrantLock lock;
    public Service(boolean isFair){
        super();
        lock=new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try{
            System.out.println(lock.isHeldByCurrentThread());
            lock.lock();
            System.out.println(lock.isHeldByCurrentThread());
        }finally {
            lock.unlock();
        }
    }
}
