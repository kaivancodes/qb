class Test extends Exception{
    Test(String msg){
        super(msg);
    }
}

public class Que3_6 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        try{
            if(a<0){
                throw new Test("The Number is Negative.");
            }
        }catch(Test e){
            System.out.println("This is a Customized Exception.");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Finally Block : End of the program");
        }
    }
}
//Explain Exception handling in JAVA. Write an application that generates custom 
//exception if any value from its command line arguments is negative.
//(Jun-2012-OLD)(Jan-2013-OLD)[NLJIET] 07