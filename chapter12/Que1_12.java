public class Que1_12 {
    public static void main(String[] args) {
        alphabets alp = new alphabets();
        alp.startThread();
        numbers num = new numbers();
        num.startThread();
    }
}
class alphabets implements Runnable{
    Thread t1;
    @Override
    public void run() {
        for(char ch = 'A' ; ch <= 'Z' ; ch++){
            System.out.println(ch);
        }
    }

    public void startThread(){
        t1 = new Thread(this);
        t1.start();
    }
}

class numbers implements Runnable{
    Thread t2;
    @Override
    public void run() {
        for(int i = 1; i <= 100; i++){
            System.out.println(i);
        }
    }
    public void startThread(){
        t2 =new Thread(this);
        t2.start();
    }
}
//Write a program to create two thread one display alphabet from a to z and other will
//display numbers from 1 to 100. (Jun-2019-OLD)[NLJIET] 04