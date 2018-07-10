package waitandnotify.size5;

import java.text.SimpleDateFormat;
import java.util.Date;

import static waitandnotify.size5.MyList.myList;

public class ThreadA extends Thread {
    private Object obj;

    public ThreadA(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        synchronized (obj) {
            if (MyList.getSize()!=5){
                System.out.println("------wait()方法执行前；" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis())) + "-------");
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
