package Lock.ReentrantLockTest;

public class run {
    public static void main(String[] args) {
        MyService service=new MyService();
        MyThread t1=new MyThread(service);
        MyThread t2=new MyThread(service);
        MyThread t3=new MyThread(service);
        MyThread t4=new MyThread(service);
        MyThread t5=new MyThread(service);
        MyThread t6=new MyThread(service);
        t1.setName("t1");
        t1.start();
        t2.setName("t2");
        t2.start();
        t3.setName("t3");
        t3.start();
        t4.setName("t4");
        t4.start();
        t5.setName("t5");
        t5.start();
        t6.setName("t6");
        t6.start();
    }
}
