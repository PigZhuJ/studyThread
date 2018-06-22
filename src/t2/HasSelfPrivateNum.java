package t2;

public class HasSelfPrivateNum {
            private int Num=0;
    public void addI(String userName){
        try {
            if(userName.equals("a")){
                Num=100;
                System.out.println("a set of over");
                Thread.sleep(20000);
            }else{
                Num=200;
                System.out.println("b set of over");
            }
            System.out.println(userName+" Num: "+Num);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
