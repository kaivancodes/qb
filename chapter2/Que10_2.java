import java.util.Scanner;
public class Que10_2
{
    public static void main(String[] args)
    {
        String original,reverse="";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String:");
        original=sc.nextLine();

        for(int i = original.length()-1;i >= 0; i--)
        {
            reverse=reverse+original.charAt(i);
        }
        System.out.println(original.equals(reverse) ? "String is Palindrome" : "String is not Palindrome");
        
        sc.close();
    }
}
//Write a program to find whether the given string is palindrome or not. (Nov-2017-OLD) 03 [NLJIET]