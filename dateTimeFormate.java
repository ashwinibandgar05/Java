import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateTimeFormate {
    public static void main(String[] args){
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df =DateTimeFormatter.ofPattern("dd-MM-yyyy--E H:m a");//This is the format

        String MyDate=df.format(dt);//Creating date string using date and format
        System.out.println(MyDate);
    }
}
