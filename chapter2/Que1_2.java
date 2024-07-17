import java.util.Scanner;
public class Que1_2 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter A Number:");
        int num=s.nextInt();
        if(num>0)
        {
            System.out.println(num+" is Positive.");
        }
        else
        {
            System.out.println(num+" is Negative");
        }
        s.close();
    }
}
//Write a java program to check if the number is negative or positive. [NLJIET] 04