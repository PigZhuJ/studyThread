package t7;

public class ThreadB extends Thread {
    private Task task;

    public ThreadB(Task task) {
        this.task = task;
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
