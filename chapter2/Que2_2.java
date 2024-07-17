import java.util.Scanner;
public class Que2_2 {
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);
        System.out.print("Enter A Number:");
        int A=n.nextInt();
        if(A%2==0)
        {
            System.out.println(A+" is Even");
        }
        else
        {
            System.out.println(A+" is Odd");
        }
        n.close();
    }
}
//Write a java program to check if the number is even or odd. [NLJIET] 04