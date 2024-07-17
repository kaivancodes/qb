public class Que9a_2 {
    public static void main(String[] args) {
        int N=Integer.parseInt (args[0]);
        int count=1;
        boolean flag=true;
        System.out.println("Prime numbers\n");
        for(int i = 2; count <=N; i++)
        {
            flag=true;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                System.out.println(i);
                count++;
            }
        }
    }
}
//Write a program which displays first n prime number?
//Where is n provided by user as command line argument? (Jan-2024-NEW)[NLJIET] 04