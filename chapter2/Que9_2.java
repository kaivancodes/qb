import java.util.*;
public class Que9_2
{
    public static void main(String[] args)
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to check prime number:");
        int num = sc.nextInt();
        if(num==2)
        {
            System.out.println(num+" is a prime number");
        } 
        else
        {
            for(int i=1;i<=num;i++)
            {
                if(num%i==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.println(num+ " is a prime number");
            }
            else 
            {
                System.out.println(num+ " is not a prime number");
            }
        }
        sc.close();
   }
}
//Write a java program which check whether entered number 
//is prime or not ? (Apr-2017- OLD)[NLJIET] 07