import java.util.Scanner;

class rectangle{
    int length;
    int width;
    double X,Y;
    rectangle(){
        length = 1;
        width = 1;
        X = 0;
        Y = 0;
    }
    rectangle(double X, double Y, int length, int width){
        this.length = length;
        this.width = width;
        this.X = X;
        this.Y = Y;
    }
    public int getArea(){
        int area;
        area = length * width;
        return area;
    }
    public int getPerimeter(){
        int perimeter;
        perimeter = 2 * (length + width);
        return perimeter;
    }
    boolean point(double X, double Y){
        double pointX = X;
        double pointY = Y;
        if (pointX < (this.X + (this.width)) && pointX > (this.X - (this.width)) &&
           pointY < (this.Y + (this.length)) && pointY > (this.Y - (this.length))){
            return true;
        }
        else{
            return false;
        }
    }
}

public class Que5_7_9_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        rectangle rect = new rectangle();
        System.out.print("Enter Length of Rectangle:");
        rect.length = sc.nextInt();
        System.out.print("Enter Width of Rectangle:");
        rect.width = sc.nextInt();
        System.out.println("Area of Rectangle is: " + rect.getArea());
        System.out.println("Perimeter of Rectangle: " + rect.getPerimeter());
        System.out.println("point inside rectangle = "+rect.point(50,50));

        //rectangle rect1 = new rectangle((sc.nextDouble()), (sc.nextDouble()), (sc.nextInt()),(sc.nextInt()));
        rectangle rect1 = new rectangle(50,50,2,2);
        System.out.println("Area of Rectangle is: " + rect1.getArea());
        System.out.println("Perimeter of Rectangle: " + rect1.getPerimeter());
        System.out.println("point inside rectangle = "+rect1.point(rect1.X, rect1.Y));

        sc.close();
    }
}
// Write a class named Rectangle to represent a rectangle. It contains following members:
// Data: width (double) and height (double) that specify the width and height of the rectangle.
// Methods:
// 1. A no-arg constructor that creates a default rectangle.
// 2. A constructor that creates a rectangle with the specified width and height.
// 3. A method named getArea() that returns the area of this rectangle.
// 4. A method named getPerimeter() that returns the perimeter (Jun-2019-OLD)[NLJIET] 07


// Define the Rectangle class that contains:
// Two double fields x and y that specify the center of the rectangle, the data field
// width and height , A no-arg constructor that creates the default rectangle with (0,0) 
// for (x,y) and 1 for both width and height.
// A parameterized constructor creates a rectangle with the specified x,y,height and width. 
// A method getArea() that returns the area of the rectangle.
// A method getPerimeter() that returns the perimeter of the rectangle.
// A method contains(double x, double y) that returns true if the specified point 
// (x,y) is inside this rectangle.
// Write a test program that creates two rectangle objects. One with default values 
// and other with user specified values. Test all the methods of the class for both the objects. 
// (Nov- 2011-OLD)[NLJIET] 07


// Design a java class Rectangle which contains following field and methods:
// (i) Field: length, width: int
// (ii) Default Constructor: initialize all fields with 0 value
// (iii) Method: int getArea() will return area of rectangle.
// (Jan-2024-NEW)[NLJIET] 07