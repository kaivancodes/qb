import java.util.Scanner;
public class Que5_2 {
    public static int fibo(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fibo(n-2)+fibo(n-1);
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number to get Fibonacci Series:");
        n = s.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println(fibo(i)+" ");
        }
        s.close();
    }
}
// public class Que5a_2 {
//     public static void printFibo(int n) {

//         int a = 0; // 0 // 1 // 1 // 2 // 3
//         int b = 1; // 1 // 1 // 2 // 3 // 5

//         while (n != 0) {

//             int c = a + b; // 1 // 2 // 3 // 5 // 8

//             System.out.println(b + " ");

//             a = b;
//             b = c;
//             n--;
//         }
//     }
    
//     // 1 1 2 3 5 8

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number to get Fibonacci Series:");
//         int n = sc.nextInt();
//         printFibo(n);
//         sc.close();
//     }
// }
//Write a java program to print the first n Fibonacci numbers. [NLJIET] 07