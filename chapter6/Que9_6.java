import java.util.Scanner;

abstract class Shape{
    double base, height, radius;
    double area;
    Scanner sc = new Scanner(System.in);
    void initFun(){
        System.out.print("Enter Height:");
        base = sc.nextInt();
        System.out.print("Enter Base:");
        height = sc.nextInt();
    }
    void initFun1(){
        System.out.print("Enter Radius:");
        radius = sc.nextInt();
    }
    abstract public void area();
}

class Rectangle extends Shape{

    @Override
    public void area() {
        area = (base*height);
        System.out.println("Area of Rectangle is: " + area);
    }
}

class Triangle extends Shape{

    @Override
    public void area() {
        area = (base*height) / 2;
        System.out.println("Area of Triangle is: " + area);
    }
}

class Circle extends Shape{

    @Override
    public void area() {
        area = radius * radius * Math.PI;
        System.out.println("Area of Circle is: " + area);
    }
}

public class Que9_6 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.initFun();
        r.area();
        Triangle t = new Triangle();
        t.initFun();
        t.area();
        Circle c = new Circle();
        c.initFun1();
        c.area();
    }
}
//Describe abstract class called Shape, which has three subclasses say Triangle,
//Rectangle, and Circle. Define one method area() in the abstract class and override
//this area() in these three subclasses to calculate for specific object
//i.e. area() of Triangle subclass should calculate area of triangle etc.
//Same for Rectangle and Circle. (Jun-2012-OLD) (Oct-2020- NEW)[NLJIET] 07