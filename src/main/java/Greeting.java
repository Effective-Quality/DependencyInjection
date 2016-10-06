import java.util.Calendar;
import java.util.Date;

/**
 * Created by sebastian on 13/09/16.
 */
public class Greeting {

    public Date currentTime;

    public Greeting(){
        Calendar c = Calendar.getInstance();
        currentTime = c.getTime();
    }

    public String greet(){

        String returnString = new String();

        if(currentTime.compareTo(createTime(10,0,0))<0){
            returnString = "Guten Morgen";
        } else if (currentTime.compareTo(createTime(12,0,0))<0){
            returnString = "Guten Vormittag";
        } else if (currentTime.compareTo(createTime(18,0,0))<0){
            returnString = "Guten Nachmittag";
        } else if (currentTime.compareTo(createTime(22,0,0))<0){
            returnString = "Guten Abend";
        } else if (currentTime.compareTo(createTime(23,59,59))<=0){
            returnString = "Gute Nacht";
        }

        return returnString;

    }

    private Date createTime(int hour, int min, int sec){

        Calendar c = Calendar.getInstance();

        c.set(Calendar.HOUR_OF_DAY, hour);
        c.set(Calendar.MINUTE, min);
        c.set(Calendar.SECOND, sec);

        return c.getTime();

    }

}
