import java.util.Scanner;

class circle{
    double r;
    static final double pi = Math.PI;
    public double area(double r){
        this.r = r;
        double a = r*r*pi;
        return a;
    }
}


public class Que2_4 {
    public static void main(String[] args) {
        circle c = new circle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius:");
        System.out.println("Area of Circle is:"+c.area(sc.nextDouble()));
        c.r = 50.55;
        System.out.println("Area of Circle is:"+c.area(c.r));

        sc.close();
    }   
}
//Write a program to create circle class with area function to find area of circle. 
//(Dec-2015- 07 OLD)[NLJIET]