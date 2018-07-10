package t7;

public class ThreadA extends Thread {
    private Task task;
    public ThreadA(Task task) {
        this.task=task;
    }

    @Override
    public void run() {
        try {
            task.doLongTask();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
