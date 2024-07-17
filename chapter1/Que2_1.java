import java.util.Scanner;
public class Que2_1 {
    public static void main(String[] args){
        int A,B,C;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number 1:");
		A=s.nextInt();
		System.out.print("Enter Number 2:");
		B=s.nextInt();
		System.out.print("Enter Number 3:");
		C=s.nextInt();
		System.out.println("Arithmetic Operators");
		System.out.println("Addition="+(A+B));
		System.out.println("Subtraction="+(A-B));
		System.out.println("Multipication="+(A*B));
		System.out.println("Division="+(A/B));
		System.out.println("Relational Operators");
		System.out.println("The A<B is "+(A<B));
		System.out.println("The A>B is "+(A>B));
		System.out.println("The A==C is "+(A==C));
		System.out.println("The A<=B is "+(A<=B));
		System.out.println("The A>=C is "+(A>=C));
		System.out.println("The A!=B is "+(A!=B));
		System.out.println("Increment Decrement Operators");
		System.out.println("Pre Incrementing A "+(++A));
		System.out.println("Pre Incrementing B "+(B++));
		System.out.println("After this statement the value of B is "+B);
		System.out.println("Pre Decrementing A "+(--A));
		System.out.println("Pre Decrementing B "+(B--));
		System.out.println("After this statement the value of B is "+B);
		System.out.println(A&B);
		System.out.println(A^B);
		System.out.println(A|C);
		System.out.println(A>>1);
		System.out.println(A<<1);
		System.out.println(B>>1);
		System.out.println(B<<1);
		System.out.println(~A);
		System.out.println(~C);
		s.close();
	}
}
//Write a program to demonstrate the use of operators. [NLJIET] 07