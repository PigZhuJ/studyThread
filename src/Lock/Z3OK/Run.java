package Lock.Z3OK;

import waitandnotify.notifyOne.Service;

public class Run {
    public static void main(String[] args) {
        MyService service=new MyService();
        ThreadA ta=new ThreadA(service);
        ta.start();
    }
}
