package t5;

public class run {
    public static void main(String[] args) throws InterruptedException {
        Task task=new Task();
        ThreadA threadA=new ThreadA(task);
        threadA.start();
        ThreadB threadB=new ThreadB(task);
        threadB.start();
        Thread.sleep(10000);
        long beiginTime=CommonUtils.beginTime1;
        if(CommonUtils.beginTime2<CommonUtils.beginTime1){
            beiginTime=CommonUtils.beginTime2;
        }
        long endTime=CommonUtils.endTime2;
        if(CommonUtils.endTime1>CommonUtils.endTime2){
            endTime=CommonUtils.endTime1;
        }
        System.out.println((endTime-beiginTime)/1000);
    }
}
