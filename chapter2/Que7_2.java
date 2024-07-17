import java.util.Scanner;
public class Que7_2
{
    public static void main(String args[])
    {
        int Fno=0,Sno=1,n,i,count;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number to get Fibonacci Series:");
        count=s.nextInt();
        System.out.print(Fno+" "+Sno);
        s.close();
        for(i=2;i<count;++i)
        {   
            n=Fno+Sno;
            System.out.print(" "+n);
            Fno=Sno;
            Sno=n;
        }
    }
}
//Write a JAVA program to implement the Fibonacci series using for loop control structure. 07
//(Dec-2019-OLD) [NLJIET]