import java.util.Scanner;

public class Que9_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:");
        String S1 = sc.nextLine();
        String S2 = "";
        for(int i = S1.length()-1; i >= 0; i--){
            S2 = S2 + S1.charAt(i);
        }
        System.out.println("Reversed String:" +S2);
        sc.close();
    }
}
//Write a program to reverse a string. [NLJIET] 04