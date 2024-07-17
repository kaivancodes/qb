class Que5_5 {
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
        String str= "Kaivan";
        char c = 'a';
        System.out.println(count(str, c));
    }
}
//Compare String with StringBuffer.
//Also write a program to count occurrence of character in a string. [NLJIET] 07