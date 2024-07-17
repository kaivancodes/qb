
import java.util.Scanner;

class Figure{
    int l, w;
    Figure(int a, int b){
        l = a;
        w = b;
    }
    void Area(){
        System.out.println("Area of the figure.");
    }
}
class Triangle extends Figure{
    Triangle(int g, int h){
        super(g, h);
    }
    void Area(){
        System.out.println("Area of Triangle:" +(l * w)/2);
    }
}
class Rectangle extends Figure{
    Rectangle(int k, int s){
        super(k, s);
    }
    void Area(){
        System.out.println("Area of Rectangle:" +l * w);
    }
}
public class Que4_5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Parameters for Area of Triangle:");
    Triangle obj1 = new Triangle(sc.nextInt(), sc.nextInt());
    obj1.Area();
    System.out.println("Enter Parameters for Area of Rectangle:");
    Rectangle obj2 = new Rectangle(sc.nextInt(), sc.nextInt());
    obj2.Area();
    sc.close();
    }
}

//Write a JAVA program to create a super class called figure that stores the
//dimensions of a two-dimensional object. It also defines a method called
//area () that computes the area of an object. The program derives two sub
//classes from figure. The first is rectangle and the second is Triangle.
//Each of these subclasses overrides area (), so that it returns the area of a
//rectangle and a triangle respectively. (Dec-2019-OLD)[NLJIET] 07