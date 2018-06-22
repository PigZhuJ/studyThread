package t2;

public class ThreadA extends  Thread {
    private HasSelfPrivateNum hasSelfPrivateNum;

    public ThreadA(HasSelfPrivateNum hasSelfPrivateNum) {
        this.hasSelfPrivateNum = hasSelfPrivateNum;
    }

    @Override
    public synchronized void start() {
        hasSelfPrivateNum.addI("a");
    }
}


