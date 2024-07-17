import java.util.Scanner;
public class Que5_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to get sum of Numbers:");
        int n = sc.nextInt();
        sumEven SE = new sumEven(n);
        SE.startThread();
        sumOdd SO = new sumOdd(n);
        SO.startThread();
    }
}

class sumEven implements Runnable{
    Thread se;
    int n;
    public sumEven(int n) {
        //TODO Auto-generated constructor stub
        this.n = n;
    }
    @Override
    public void run(){
        int sum = 0;
        for(int i = 2 ; i <= n ; i++){
            sum = sum + i;
            i = i + 1;
        }
        System.out.println(sum);
    }
    public void startThread(){
        Thread se = new Thread(this);
        se.start();
    }
}

class sumOdd implements Runnable{
    Thread so;
    int n;
    public sumOdd(int n) {
        this.n = n;
    }
    @Override
    public void run(){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + i;
            i = i + 1;
        }
        System.out.println(sum);
    }
    public void startThread(){
        Thread so = new Thread(this);
        so.start();
    }
}

//Write an application that read limit from user and executes two threads.
//One thread displays total of first n even numbers & another thread displays
//total of first n odd numbers.
//Create the threads by implementing the Runnable interface.
//(Apr-2017-OLD)[NLJIET] 07