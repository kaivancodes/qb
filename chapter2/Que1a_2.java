import java.util.Scanner;
public class Que1a_2 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter A Number:");
        int num=s.nextInt();
        var m=(num>0)?("Positive"):("Negative");
        System.out.println("The number is "+m);
        s.close();
    }
}
//Write a java program to check if the number is negative or positive 
//using conditional expression. [NLJIET]04