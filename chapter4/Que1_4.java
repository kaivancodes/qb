import java.util.Scanner;

class time{

    int hour,min;
    time(int h, int m){

        hour = h;
        min = m;
    }
    public void add(time t) {
        time t3 = new time(0,0);
        t3.hour = hour + t.hour;
        t3.min = min + t.min;
        if(t3.min>=60){
            t3.hour = t3.hour + (t3.min/60);
            t3.min = t3.min%60;
        }
        System.out.println("****Time****\nHours:"+t3.hour+"\nMinutes:"+t3.min);
    }
}

public class Que1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        time t1 = new time(sc.nextInt(),sc.nextInt());
        time t2 = new time(sc.nextInt(),sc.nextInt());
        // time t1 = new time(5,60);
        // time t2 = new time(5,30);
        t1.add(t2);
        
        sc.close();
    }
}
//Define time class with hour and minute. Also define addition method to 
//add two time objects. (Dec-2015-OLD)[NLJIET] 07