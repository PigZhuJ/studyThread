package Lock.lockMethodTest.test6;

public class Run {
    public static void main(String[] args) {
        final Service s1 = new Service(false);
        final Service s2 = new Service(true);
        new Thread(new Runnable() {
            @Override
            public void run() {
                s2.serviceMethod();
            }
        }).start();
    }
}
