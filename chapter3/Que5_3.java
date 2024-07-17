import java.util.Scanner;

public class Que5_3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
	    System.out.print("Enter Array rows for Array 1:");
        int m = sc.nextInt();
        
        System.out.print("Enter Array columns for Array 1:");
        int n = sc.nextInt();

        System.out.print("Enter Array rows for Array 2:");
        int x = sc.nextInt();
        
        System.out.print("Enter Array columns for Array 2:");
        int y = sc.nextInt();

        if(n!=x){
            System.out.println("Matrix multiplication is not Possible.");
        }

        else{

        int a[][]= new int[m][n];
        
        System.out.println("Enter Elements:");

        for(int i = 0; i < a.length; i++)
	    {
		    for(int j = 0; j < a.length; j++)
		    {
		        a[i][j] = sc.nextInt();
		    }
	    }

        int b[][]= new int[x][y];
        
        System.out.println("Enter Elements:");

        for(int i = 0; i < b.length; i++)
	    {
		    for(int j = 0; j < b.length; j++)
		    {
		        b[i][j] = sc.nextInt();
		    }
	    }
        int c[][]=new int[m][y];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                c[i][j]=0;
                for(int k=0;k<a.length;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    }
}

//Write a java program to perform matrix multiplication using
//two dimensional array. [NLJIET] 07
/*
public class MatrixMul {
    public static void main(String args[])
    {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{1,2,3},{4,5,6},{7,8,9}};
        int c[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
//Write a java program to perform matrix multiplication using
//two dimensional array. 07 [NLJIET]
*/