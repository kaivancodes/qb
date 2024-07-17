public class Que3_12 {
    public static void main(String[] args) {
        even e = new even();
        e.startThread();
        odd o = new odd();
        o.startThread();
    }
}

class even implements Runnable{
    Thread e1;
    @Override
    public void run(){
        for(int i = 0; i <= 100; i++){  //20
            System.out.println(i);
            i = i + 1;
        }
    }
    public void startThread(){
        Thread e1 = new Thread(this);
        e1.start();
    }
}

class odd implements Runnable{
    Thread o1;
    @Override
    public void run(){
        for(int i = 0 ; i <= 100 ; i++){    //20
            if(i%2 != 0)
            System.out.println(i);
        }
    }
    public void startThread(){
        Thread o1 = new Thread(this);
        o1.start();
    }
}

//Write a program to create two threads, one thread will print odd numbers and 
//second thread will print even numbers between 1 to 100 numbers.
//(May-2016-OLD)[NLJIET] 07
//Write a program to create two threads, one thread will print odd numbers and 
//second thread will print even numbers between 1 to 20 numbers. 
//(Dec-2014-OLD)[NLJIET] 07