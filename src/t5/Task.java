package t5;

public class Task {
    public String getData1;
    public String getData2;
    public synchronized void doLongTask(){
        try{
            System.out.println("Begin Task");
            Thread.sleep(3000);
            getData1="长时间处理任务之后从远程返回的值1，threadName= "+Thread.currentThread().getName();
            getData2="长时间处理任务之后从远程返回的值2，threadName= "+Thread.currentThread().getName();
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("End Task");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
