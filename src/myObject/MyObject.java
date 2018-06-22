package myObject;

/**
 * sychornized方法与锁对象
 */
public class MyObject {
    synchronized public void methodA(){
        try{
            System.out.println("begin methodA ThreadName="+Thread.currentThread().getName());
            Thread.sleep(5000);// try catch
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
