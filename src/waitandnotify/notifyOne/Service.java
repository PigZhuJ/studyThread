package waitandnotify.notifyOne;

public class Service {
    public void testMethod(Object obj) throws InterruptedException {
        synchronized (obj){
            System.out.println("---------wait() method begin ThreadName :"+Thread.currentThread().getName());
            obj.wait();
            System.out.println("---------wait() method end ThreadName : "+Thread.currentThread().getName());
        }
    }
}
