package waitandnotify.Test1;

public class test2 {
    public static void main(String[] args) throws InterruptedException {
        String lock = new String("");
        System.out.println("-----------------同步代码块之前------------------");
        synchronized (lock) {
            System.out.println("-----------------同步代码块中------------------");
            lock.wait();
            System.out.println("-----------------同步代码块后------------------");
        }
    }
}
