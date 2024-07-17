public class Que4_3
{
    public static void isSorted(int[] a) 
    {
        int i,count=0;
        for(i = 0; i < a.length-1; i++)
        {
            if (a[i] < a[i+1])
            {
                count=count+1;
            }
        }
        if(count==a.length-1)
        System.out.println("Sorted");
        else
        System.out.println("Not Sorted");
    }
    public static void main(String[] args)
    {
        int ar[] = {3,5,6,7};
        isSorted(ar);
    }
}
//Write a program that creates an integer array and then uses a for
//loop to check whether the array is sorted from smallest to largest. If so, 
//it prints “sorted” otherwise it prints “Not sorted”. (Dec-2021-OLD)[NLJIET] 07