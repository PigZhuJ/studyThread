package Lock.ConditionTest;

public class Run {
    public static void main(String[] args) {
        MyServices ms = new MyServices();
        ThreadA ta = new ThreadA(ms);
        ta.start();
        ThreadB tb=new ThreadB(ms);
        tb.start();
    }

}
