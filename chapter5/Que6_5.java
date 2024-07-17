import java.util.Scanner;

public class Que6_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String s1 = sc.nextLine();
        String s2 = "";
        for(int i = s1.length() - 1; i >= 0; i--){
            s2 = s2 + s1.charAt(i);
        }
        System.out.println(s1.equals(s2)? "Palindrome": "Not Palindrome");
        sc.close();
    }
}
//Write a program that creates a String and then test whether the String 
//is a palindrome or not, which means that if you reverse the order of 
//the characters in the String, you get the same String back. (Dec-2021-OLD)[NLJIET] 07