package Lock.ReentrantReadWriteLock.ReadWrite;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class readWrite {
    private ReentrantReadWriteLock lock=new ReentrantReadWriteLock();
    public void read(){
        try {
            lock.readLock().lock();
            System.out.println("获得读锁： "+Thread.currentThread().getName()+" "+System.currentTimeMillis());
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println("读锁释放了");
            lock.readLock().unlock();
        }
    }
    public void write(){
        try{
            lock.writeLock().lock();
            System.out.println("获得写锁： "+Thread.currentThread().getName()+" "+System.currentTimeMillis());
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println("写锁释放了");
            lock.writeLock().unlock();
        }
    }
}
