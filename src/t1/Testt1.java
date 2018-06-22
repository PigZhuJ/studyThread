package t1;

/**
 * 测试类
 */
public class Testt1 {
    public static void main(String[] args) {
        HasSelfPrivateNum hasSelfPrivateNum=new HasSelfPrivateNum();
        ThreadA a=new ThreadA(hasSelfPrivateNum);
        a.start();
        ThreadB b=new ThreadB(hasSelfPrivateNum);
        b.start();
    }
}
