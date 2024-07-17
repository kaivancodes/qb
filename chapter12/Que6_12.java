public class Que6_12 {
    public static void main(String[] args) {
        welcome w = new welcome();
        w.startThread();
        goodBye g = new goodBye();
        g.startThread();
    }
}

class welcome implements Runnable{
    Thread w1;
    @Override
    public void run(){
        for(int i = 0; i <= 10; i++){
            try
            {
                Thread.sleep(1000);
                System.out.println("Welcome");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public void startThread() {
        w1 = new Thread(this);
        w1.start();
    }
}

class goodBye implements Runnable{
    Thread g1;
    @Override
    public void run(){
        for(int i = 0; i <= 10; i++){
            try
            {
                Thread.sleep(5000);
                System.out.println("Good Bye");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public void startThread() {
        g1 = new Thread(this);
        g1.start();
    }
}

//Write an application that executes two threads.
//One thread displays "Welcome" every 1000 milliseconds &
//another thread displays "Good Bye" every 5000 milliseconds.
//Create the threads by implementing the Runnable interface.
//(Nov-2016-OLD)[NLJIET] 07