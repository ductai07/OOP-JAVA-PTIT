import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Time {
    int hour, minute, second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return hour + " " + minute + " " + second;
    }
}

public class J05033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
 
        int N = sc.nextInt();
        
  
        ArrayList<Time> times = new ArrayList<>();
        
 
        for (int i = 0; i < N; i++) {
            int hour = sc.nextInt();
            int minute = sc.nextInt();
            int second = sc.nextInt();
            times.add(new Time(hour, minute, second));
        }

       
        Collections.sort(times, new Comparator<Time>() {
            @Override
            public int compare(Time t1, Time t2) {
                if (t1.hour != t2.hour) {
                    return t1.hour - t2.hour;  
                } else if (t1.minute != t2.minute) {
                    return t1.minute - t2.minute;  
                } else {
                    return t1.second - t2.second;  
                }
            }
        });

 
        for (Time time : times) {
            System.out.println(time);
        }
    }
}
