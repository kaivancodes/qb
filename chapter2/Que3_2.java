import java.util.Scanner;
public class Que3_2 {
    public static void main(String[] args){
        Scanner D=new Scanner(System.in);
        System.out.print("Enter Number 1:");
        int A=D.nextInt();
        System.out.print("Enter Number 2:");
        int B=D.nextInt();
        System.out.print("Enter Number 3:");
        int C=D.nextInt();
        if(A>B && A>C)
        {
            System.out.println("Largest Number is:"+A);
        }
        else if(B>C)
        {
            System.out.println("Largest Number is:"+B);
        }
        else
        {
            System.out.println("Largest Number is:"+C);
        }
        //System.out.println((A > B )? "A is Greater than B" : "B is Greater than A");
        D.close();
    }
}
//Write a java program to print the greatest number among three numbers. [NLJIET] 07