import org.junit.Test;

import java.util.Date;

public class Mytest {
    @Test
    public void test(){
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }
}
