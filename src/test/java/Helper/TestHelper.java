package Helper;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by sebastian on 14/09/16.
 */
public class TestHelper {

    public Date createTime(int hour, int min, int sec){

        Calendar c = Calendar.getInstance();

        c.set(Calendar.HOUR_OF_DAY, hour);
        c.set(Calendar.MINUTE, min);
        c.set(Calendar.SECOND, sec);

        return c.getTime();

    }

}
