package waitandnotify.waitReleaseLock;

public class Service {
    public void TestMethod(Object obj) throws InterruptedException {
        synchronized (obj){
            System.out.println("begin wait() Method....");
            obj.wait();
            System.out.println("end wait() Method....");
        }
    }
}
