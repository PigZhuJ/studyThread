package Lock.lockMethodTest.test3;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service s = new Service();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                s.waitMethod();
            }
        };
        Thread[] ThreadArr = new Thread[10];
        for (int i = 0; i < 10; i++) {
            ThreadArr[i]=new Thread(r);
        }
        for (int i = 0; i < 10; i++) {
            ThreadArr[i].start();
        }
        Thread.sleep(2000);
        s.notifyMethod();
    }
}
