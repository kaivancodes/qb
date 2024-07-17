public class Que7_5 {
    public static int count(String s, char c)
    {
        int res = 0;
 
        for (int i=0; i<s.length(); i++)
        {
            if (s.charAt(i) == c)
            res++;
        } 
        return res;
    }
    public static void main(String args[])
    {
        String str;
        str = new String(args[0]);
        System.out.println("Your first argument is: "+args[0]);
        char c = 'a';
        System.out.println(count(str, c));
    }
}
//Write a program to take string input as command line argument. In addition,
//count occurrence of each character in a given string. (Oct-2020-NEW)[NLJIET] 07