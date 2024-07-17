public class Que8_12 {
    public static void main(String[] args){
        try {
            Hello m1=new Hello();
            Hello2 n2=new Hello2();
            Hello3 tt=new Hello3();
            Thread s3=new Thread(tt);
            m1.start();
            n2.start();
            s3.start();
            m1.join();
            n2.join();
            s3.join();
            System.out.println("Good Bye.... ");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Hello extends Thread {
    public void run(){
        for(int i = 0; i < 10; i++){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Hello "+Thread.currentThread().getName());
        }
    }
}

class Hello2 extends Thread{
    public void run(){
        for(int i = 0; i < 10; i++){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Hello "+Thread.currentThread().getName());
        }
    }
}

class Hello3 implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Hello "+Thread.currentThread().getName());
        }
    }
}
//Write an application that creates and starts three threads.
//Each thread is instantiated from the same class.
//It executes a loop with 10 iterations.
//Each iteration displays string "HELLO", sleeps for 300 milliseconds.
//The application waits for all the threads to complete &
//displays the message "Good Bye..." (Dec-2013-OLD)[NLJIET] 07