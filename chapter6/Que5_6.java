public class Que5_6 {
    public static void main(String[] args) {
        int x,y,result;
        try {
            x = Integer.parseInt(args[0]); // 2
            y = Integer.parseInt(args[1]); // 3
            result = 1;
            System.out.println("Exponential Operation....");
            for(int i = 1; i <= y; i++){ // 3
                result = result * x;
                // System.out.println(x+ "^" +i+ "=" +result);
            }
            System.out.println(x+ "^" +y+ "=" +result);
        } catch (Exception e) {
            System.out.println("Exception: "+e.getMessage());
        } finally{
            System.out.println("Finally Block : End of the program");
        }
    }
}
//Write a method for computing 𝑥𝑦 by doing repetitive multiplication.
//x and y are of type integer and are to be given as command line arguments.
//Raise and handle exception(s) for invalid values of x and y. Also define method main.
//Use finally in above program and explain its usage.
//(May-2016-OLD)(May-2018-OLD) (Feb-2021-NEW)[NLJIET] 07