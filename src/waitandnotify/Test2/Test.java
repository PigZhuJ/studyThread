package waitandnotify.Test2;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        Object obj = new Object();
        MyThread1 mt1 = new MyThread1(obj);
        mt1.start();
        Thread.sleep(3000);
        MyThread2 mt2=new MyThread2(obj);
        mt2.start();
    }
}
