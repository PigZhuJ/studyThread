package PublicVar;

import myObject.ThreadA;

public class PublicVar {
    public String username = "A";
    public String password = "AA";

    synchronized public void setValue(String username, String password) {
        try {
            this.username = username;
            Thread.sleep(5000);
            this.password = password;
            System.out.println("set method Thread Name=" + Thread.currentThread().getName() + "username:" + username + "password:" + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
        public void getValue() {
            System.out.println();

    }
}
