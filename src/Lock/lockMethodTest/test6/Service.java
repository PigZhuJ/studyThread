package Lock.lockMethodTest.test6;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 测试 isFair()方法
 * 判断是公平锁还是非公平锁
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();

    /**
     * 构造函数
     *
     * @param isFair
     */
    public Service(boolean isFair) {
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        try {
            lock.lock();
            System.out.println("公平锁情况： " + lock.isFair());
        } finally {
            lock.unlock();
        }
    }
}
