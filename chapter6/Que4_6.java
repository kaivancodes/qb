class Test2 extends Exception{
    Test2(String msg){
        super(msg);
    }
}

public class Que4_6 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        try{
            if(a>100){
                throw new Test2("The Number is Greater then 100.");
            }
        }catch(Exception e){
            System.out.println("This is Customized Exception.");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Finally Block : End of the program");
        }
    }    
}

//Explain Exception handling in JAVA. Write an application that generates custom
//exception if any value entered from command line arguments is greater than 100.
//[NLJIET] 07