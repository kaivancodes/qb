public class Que9_12 {
    public static void main(String[] args) {
        morning w = new morning();
        w.startThread6();
        afternoon b = new afternoon();
        b.startThread6();
    }
}

class morning implements Runnable{
    Thread w1;
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Good Morning");
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public void startThread6() {
        w1 = new Thread(this);
        w1.start();
    }
}

class afternoon implements Runnable{
    Thread b1;
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(3000);
                System.out.println("Good Afternoon");
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public void startThread6() {
        b1 = new Thread(this);
        b1.start();
    }
}

//Write an application that executes two threads.
//One thread displays "Good Morning" every 1000 milliseconds
//& another thread displays "Good Afternoon" every 3000 milliseconds.
//Create the threads by implementing the Runnable interface. 
//(Dec-2013-OLD)[NLJIET] 07