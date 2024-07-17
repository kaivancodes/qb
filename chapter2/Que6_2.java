import java.util.Scanner;
public class Que6_2 {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number to get Table:");
        n=s.nextInt();
        for (int i=1;i<=n;i++)
        {
            System.out.println("Table of "+i);
            for (int j=1;j<=10;j++)
            {
                System.out.println(i+"x"+j+"=" +(i*j));
            }
            System.out.println();
        }
        s.close();
    }
}
//Write a program to display a multiplication table of 1 to 10 using nested loop. [NLJIET] 07