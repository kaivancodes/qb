public class Que6_3 {
    public static int Fibo(int n)
    {
        int a=0;
        int b=1;
        if(n==0){
            return a;
        }
        for(int i=2;i<=n;i++)
        {
            int c=a+b;
            System.out.println(b+ " ");
            a=b;
            b=c;
        }
        return b;
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(Fibo(n));
    }   
}
//Write a method for computing first n terms of Fibonacci sequence.
//Define method main taking value of n as command line argument and
//calling the method. (Nov-2016- OLD)[NLJIET] 04