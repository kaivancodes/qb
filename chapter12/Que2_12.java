public class Que2_12 {
    public static void main(String[] args) {
        integer ints = new integer();
        //ints.startThread();
        ints.start();
    }
}
/*class integer implements Runnable{
    Thread q1;
    @Override
    public void run(){
        for(int i = 1 ; i <= 10; i++){
            System.out.println((i));
        }
    }
    public void startThread(){
        Thread q1 = new Thread(this);
        q1.start();
    }
}*/

class integer extends Thread{
    @Override
    public void run(){
        for(int i = 1 ; i <= 10; i++){
            System.out.println((i));
        }
    }
}
//Explain Thread life cycle in detail. Write a program to create a child thread 
//to print integer numbers 1 to 10. (Oct-2020-NEW)[NLJIET] 07