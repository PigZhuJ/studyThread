package t5;

public class ThreadB extends Thread{
    private Task task;

    public ThreadB(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        CommonUtils.beginTime2=System.currentTimeMillis();
        task.doLongTask();
        CommonUtils.endTime2=System.currentTimeMillis();
    }
}
