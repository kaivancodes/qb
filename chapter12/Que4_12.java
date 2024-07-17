import java.util.Scanner;

public class Que4_12 {
    public static void main(String[] args) {
        primeCheck pc = new primeCheck();
        pc.startThread();
        primeCount pC = new primeCount();
        pC.startThread();
    }
}

class primeCheck implements Runnable{
    Thread pc1;
    @Override
    public void run(){
        System.out.print("Enter a number to check prime or not:");
        int n = new Scanner(System.in).nextInt();
        boolean flag = false;
        for(int i = 2; i < n; i++){
            if(n%i == 0){
                flag = true;
            }
        }
        if(!flag){
            System.out.println("It is a Prime.");
        }
        else{
            System.out.println("It is not a Prime");
        }
    }
    public void startThread(){
        Thread pc1 = new Thread(this);
        pc1.start();
    }
}

class primeCount implements Runnable{
    Thread pc2;
    @Override
    public void run(){
        int n = 100;
        int i = 0;
        int num = 0;
        String  primeNumbers = "";
        for (i=0;i<=n;i++)  	   
        {
            int counter=0; 		  
            for(num=i;num>=1;num--)
            {
                if(i%num==0)
                {
                    counter=counter+1;
	            }
            }
            if (counter==2)
            {
                primeNumbers=primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to "+n+" are :");
        System.out.println(primeNumbers);
    }
    public void startThread(){
        Thread pc2 = new Thread(this);
        pc2.start();
    }
}

//Write a program to create two threads,
//one thread will check whether given number is prime or not and
//second thread will print prime numbers between 0 to 100.
//(May-2018- OLD)[NLJIET] 07