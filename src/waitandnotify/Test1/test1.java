package waitandnotify.Test1;

/**
 * wait（）和 notify（）必须持有正确的对象锁
 */
public class test1 {
    public static void main(String[] args) throws InterruptedException {
        String str=new String("");
        str.wait();
    }
}
