package Lock.ReentrantReadWriteLock.ReadRead;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 多个读锁之间不互斥
 */
public class ReadRead {
    private ReentrantReadWriteLock lock=new ReentrantReadWriteLock();//读写锁
    public void read(){
        try {
            lock.readLock().lock();//上锁
            System.out.println("获得读锁： "+Thread.currentThread().getName()+" "+System.currentTimeMillis());
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.readLock().unlock();
        }
    }
}
