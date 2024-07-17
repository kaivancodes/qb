public class Que1_6 {
    public static void main(String[] args) {
        int a = 10,b = 0;
        try{
        System.out.println("Hello");
        //System.out.println(a/b);
        System.out.println("Hi");
        System.out.println("Bye");
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Kem cho");
        }
        System.out.println("Maja ma");
    }
}
// Consider following code fragment: try {
// statement1;
// statement2;
// statement3;
// }
// catch (Exception1 ex1) {
// }
// finally {
// statement4;
// }
// statement5;
// 1. Which Statements will execute if no exception is occurs.
// 2. Which Statements will execute if Exception 1 is occurs at statement 2.
// (Jun-2019- OLD)[NLJIET] 04