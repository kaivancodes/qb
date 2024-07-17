interface P{
    public static final int p= 100;
    void method_P();
}
interface P1 extends P{
    public static final int p1= 10;
    void method_P1();
}
interface P2 extends P{
    public static final int p2= 20;
    void method_P2();
}
interface P12 extends P1, P2{
    public static final int p12= 30;
    void method_P12();
}
class Q implements P12{
    public void method_P12(){
        System.out.println("P12 Class Method Constant : " +p12);
    }
    public void method_P1(){
        System.out.println("P1 Class Method Constant : " +p1);
    }
    public void method_P2(){
        System.out.println("P2 Class Method Constant : " +p2);
    }
    public void method_P(){
        System.out.println("P Class Method Constant : " +p);
    }
}
public class Que13_6 {
    public static void main(String[] args) {
        Q obj = new Q();
        obj.method_P12();
        obj.method_P1();
        obj.method_P2();
        obj.method_P();
    }   
}
// Write a program that illustrates interface inheritance. 
// Interface P is extended by P1 and P2. Interface P12 inherits from both P1 and P2.
// Each interface declares one constant and one method. class Q implements P12.
// Instantiate Q and invoke each of its Methods. Each method displays one of the constants. 
// (Jun-2012-OLD)(Jan-2022-NEW)[NLJIET] 07
// Write a program that illustrates interface inheritance.
// Interface A is extended by A1 and A2. Interface A12 inherits from both P1 and P2.
// Each interface declares one constant and one method. Class B implements A12.
// Instantiate B and invoke each of its methods. Each method displays one of the constants.
// (Dec-2014-OLD)[NLJIET] 07