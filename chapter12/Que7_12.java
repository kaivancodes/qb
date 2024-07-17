public class Que7_12 {
    public static void main(String[] args){
        try {
            
            Thread2 n2=new Thread2();
            Thread3 tt=new Thread3();
            Thread s3=new Thread(tt);
            
            n2.start();
            s3.start();

            n2.join();
            s3.join();

            Thread1 m1=new Thread1();
            m1.start();
            System.out.println("End of Threads 2 & 3 ");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
class Thread1 extends Thread {
    public void run(){
        for(int i = 0; i < 10; i++){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Hello 1");
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        for(int i = 0; i < 10; i++){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Hello 2");
        }
    }
}

class Thread3 implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Hello 3");
        }
    }
}

//What is multithreading? Why it is required?
//Write a program that creates three threads.
//Make sure that the main thread executes last.
//(Jan-2013-OLD)[NLJIET] 07