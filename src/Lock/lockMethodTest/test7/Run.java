package Lock.lockMethodTest.test7;

public class Run {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                new Service(true).serviceMethod();
            }
        }).start();

    }
}
