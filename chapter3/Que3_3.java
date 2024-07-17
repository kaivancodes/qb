public class Que3_3{
    public static void main(String[] args)
    {
        int neg_count=0;
        int[] num = new int[args.length];
        for(int i=0;i<args.length;i++)
        {
            num[i] = Integer.parseInt(args[i]);
            if(num[i] < 0)
            neg_count++;
        }
        for (int e: num){
        System.out.println(e + "\t");
        }
        System.out.println("Total Negative Numbers Entered are: "+neg_count);
    }
}
//Write a program which takes five numbers as command line argument from user,
//store them in one dimensional array and display count of negative numbers. (Dec-2018- OLD)[NLJIET]
//Write a program to take three numbers as command line argument. Display
//the maximum among them? (Jun-2019-OLD)[NLJIET]
//04 04