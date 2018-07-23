package Lock.ConditionTestMoreMethod;

public class ThreadAA extends Thread{
    private MyService service;

    public ThreadAA(MyService service){
        this.service=service;
    }

    @Override
    public void run() {
        try {
            service.methodA();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
