package Lock.ReentrantReadWriteLock.WriteWrite;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 多个读锁之间不互斥
 */
public class WriteWrite


{
    private ReentrantReadWriteLock lock=new ReentrantReadWriteLock();//读写锁
    public void write(){
        try {
            lock.writeLock().lock();//上锁
            System.out.println("获得读锁： "+Thread.currentThread().getName()+" "+System.currentTimeMillis());
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.writeLock().unlock();
        }
    }
}
