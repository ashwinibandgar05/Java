import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Date;


public class PracticeSet {
    public static void main(String[] args){

        //Create an arraylist and store names of 10 students inside it .Print it using a for each loop
        ArrayList arr=new ArrayList();
        arr.add("Ash");
        arr.add("Ashwini");
        arr.add("Ashitosh");
        arr.add("Pranali");
        arr.add("Suraj");
        arr.add("Tushar");
        arr.add("Mitali");
        arr.add("Utkarsha");
        arr.add("Isha");
        arr.add("Anisha");
        for(Object o:arr){
            System.out.println(o);
        }
        

        //Create the set of elements in the java . Try to Store duplicate eelements inside this set and verify that only one instance is stored
        HashSet<Integer> hs=new HashSet<>();
        hs.add(0);
        hs.add(2);
        hs.add(4);
        hs.add(5);
        hs.add(8);
        hs.add(2);
        System.out.println(hs);

        //Use the date class in java to print time in the following format:21:47:02
        Date d=new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        //Repeat Above question  using the calendar class

        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));  //c.get(Calendar.HOUR)=> will give the time in 12 hour clock not in 24 hour clock

        // repeat above question using java.time API
        LocalDateTime dt=LocalDateTime.now();
        DateTimeFormatter df =DateTimeFormatter.ofPattern("H:m:s");//This is the format
        String MyDate=df.format(dt);//Creating date string using date and format
        System.out.println(MyDate);
        



    }
}
