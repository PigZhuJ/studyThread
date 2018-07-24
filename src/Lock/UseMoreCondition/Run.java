package Lock.UseMoreCondition;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyServices services=new MyServices();
        ThreadA ta=new ThreadA(services);
        ta.start();
        ThreadB tb=new ThreadB(services);
        tb.start();
        Thread.sleep(1000);
        services.signalAll_B();
    }
}
