package Lock.lockMethodTest.test2;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service=new Service();
        Runnable r=new Runnable() {
            @Override
            public void run() {
                service.serviceMethod1();
            }
        };
        Thread[] ThreadArr=new Thread[10];
        for (int i = 0; i < 10; i++) {
            ThreadArr[i]=new Thread(r);
        }
        for (int i = 0; i < 10; i++) {
            ThreadArr[i].start();
        }
        Thread.sleep(2000);
        System.out.println("等待的线程数 ： "+service.lock.getQueueLength());
    }
}
