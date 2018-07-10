package waitandnotify.size5;

import static waitandnotify.size5.MyList.myList;

public class ThreadB extends Thread {
    private Object obj;

    public ThreadB(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        synchronized (obj){
            for (int i = 0; i <10 ; i++) {
                MyList.add();
                if(MyList.getSize()==5){
                 obj.notify();
                    System.out.println("已经发出通知");
                }
                System.out.println("添加了"+(i+1)+"个元素");
            }
        }
    }
}
