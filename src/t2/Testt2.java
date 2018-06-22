package t2;

/**
 * 测试类
 */
public class Testt2 {
    public static void main(String[] args) {
        HasSelfPrivateNum hasSelfPrivateNum=new HasSelfPrivateNum();
        ThreadA a=new ThreadA(hasSelfPrivateNum);
        a.start();
        ThreadB b=new ThreadB(hasSelfPrivateNum);
        b.start();
    }
}
