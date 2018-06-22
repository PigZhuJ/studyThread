package t1;

public class HasSelfPrivateNum {
    public void addI(String userName){
        try {
            int Num=0;
            if(userName.equals("a")){
                Num=100;
                System.out.println("a set of over");
                Thread.sleep(2000);
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
