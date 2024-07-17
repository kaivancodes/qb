import java.util.Scanner;
public class Que4_2 {
    public static void main(String[] args){
        double A,B;
        Scanner a=new Scanner(System.in);
        System.out.print("Enter Number 1:");
        A=a.nextDouble();
        System.out.print("Enter Number 2:");
        B=a.nextDouble();
        System.out.println("Maximum="+Math.max(A,B));
        System.out.println("Minimum="+Math.min(A,B));
        System.out.println("Power="+Math.pow(A,B));
        System.out.println("Power="+Math.pow(B,A));
        System.out.println("Square Root of A="+Math.sqrt(A));
        System.out.println("Square Root of B="+Math.sqrt(B));
        System.out.println("Log A="+Math.log(A));
        System.out.println("Log B="+Math.log(B));
        System.out.println("Log10 A="+Math.log10(A));
		System.out.println("Log10 B="+Math.log10(B));
		System.out.println("Sin A="+Math.sin(A));
		System.out.println("Sin B="+Math.sin(B));
		System.out.println("Cos A="+Math.cos(A));
		System.out.println("Cos B="+Math.cos(B));
		System.out.println("Tan A="+Math.tan(A));
		System.out.println("Tan B="+Math.tan(B));
		System.out.println("Exponential A="+Math.exp(A));
		System.out.println("Exponential B="+Math.exp(B));
		System.out.println("Ceiling A="+Math.ceil(A));
		System.out.println("Ceiling B="+Math.ceil(B));
		System.out.println("Floor A="+Math.floor(A));
		System.out.println("Floor B="+Math.floor(B));
		System.out.println("Round A="+Math.round(A));
		System.out.println("Round B="+Math.round(B));
		//System.out.println("Absolute A="+Math.abs(A));
		//System.out.println("Absolute B="+Math.abs(B));
        a.close();
    }
}
//Write a simple java program to illustrate the use of mathematical functions. [NLJIET] 07