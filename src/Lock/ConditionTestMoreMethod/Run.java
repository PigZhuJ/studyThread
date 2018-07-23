package Lock.ConditionTestMoreMethod;

public class Run {
    public static void main(String[] args) {
        MyService myService=new MyService();
        ThreadA ta=new ThreadA(myService);
        ta.setName("a");
        ta.start();
        ThreadAA taa=new ThreadAA(myService);
        taa.setName("aa");
        taa.start();
        ThreadB tb=new ThreadB(myService);
        tb.setName("b");
        tb.start();
        ThreadBB tbb=new ThreadBB(myService);
        tbb.setName("bb");
        tbb.start();
    }
}
