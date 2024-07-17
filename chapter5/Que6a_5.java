import java.util.Scanner;
public class Que6a_5 {
    public static void main(String[] args) {
        int r,sum=0,temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n=sc.nextInt();
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
        System.out.println("Palindrome number ");
        else
        System.out.println("Not a Palindrome");
    }
}
//Write a program//to find out whether
//the given number is palindrome or not? (Jan-2024-NEW)[NLJIET] 03