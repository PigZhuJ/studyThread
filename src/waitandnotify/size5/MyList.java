package waitandnotify.size5;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static List myList =new ArrayList();
    public static void add(){
        myList.add("anything");
    }
    public static int getSize(){
        return myList.size();
    }

}
