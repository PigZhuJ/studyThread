package Lock.UseConditionWaitNotifyRight;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service=new MyService();
        ThreadA ta=new ThreadA(service);
        ta.start();
        Thread.sleep(3000);
        service.signal();
    }
}
