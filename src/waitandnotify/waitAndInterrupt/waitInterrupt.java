package waitandnotify.waitAndInterrupt;

public class waitInterrupt {
    public void testMethod(Object obj) throws InterruptedException {
        synchronized (obj){
            System.out.println("------wait() Method begin to excute-----------");
            obj.wait();
            System.out.println("------wait() Method end to excute-----------");
        }
    }
}
