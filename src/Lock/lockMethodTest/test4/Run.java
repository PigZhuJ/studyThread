package Lock.lockMethodTest.test4;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service s = new Service();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                s.waitMethod();
            }
        };
       Thread ta=new Thread(r);
       ta.start();
       Thread.sleep(500);
       Thread tb=new Thread(r);
       tb.start();
       Thread.sleep(500);
        System.out.println(s.lock.hasQueuedThread(ta));
        System.out.println(s.lock.hasQueuedThread(tb));
        System.out.println(s.lock.hasQueuedThreads());
    }
}
