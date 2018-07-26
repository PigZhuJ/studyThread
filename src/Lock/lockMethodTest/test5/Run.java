package Lock.lockMethodTest.test5;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service s=new Service();
        Runnable r=new Runnable() {
            @Override
            public void run() {
                s.waitMethod();
            }
        };
        Thread[] threadArr=new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadArr[i]=new Thread(r);
        }
        for (int i = 0; i < 10; i++) {
            threadArr[i].start();
        }
        Thread.sleep(2000);
        s.notifyMethod();
    }
}
