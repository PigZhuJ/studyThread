package t7;

public class Run {
    public static void main(String[] args) {
        Task task=new Task();
        ThreadA threadA=new ThreadA(task);
        threadA.start();
        ThreadB threadB=new ThreadB(task);
        threadB.start();
    }
}
