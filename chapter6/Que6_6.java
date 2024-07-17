import java.util.Scanner;

class Cartesian extends Exception{
    double x, y, z;
    double result;
    
    public Cartesian() {
    }
    public Cartesian(double x, double y, double z){

        this.x = x;
        this.y = y;
        this.z = z;
    }
    void add_coordinates() throws Cartesian{
        result = x + y + z;
        if(result==0){
            throw new Cartesian();
        }
        // z = x + y;
        // if(z==0){
        //     throw new Cartesian();
        // }
    }
}

public class Que6_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of X:");
        int x = sc.nextInt();
        System.out.print("Enter value of Y:");
        int y =  sc.nextInt();
        System.out.print("Enter value of Z:");
        int z =  sc.nextInt();
        Cartesian obj = new Cartesian(x,y,z);
        // Cartesian obj = new Cartesian(5,5,10);
        try {
            obj.add_coordinates();

        } catch (Cartesian e) {
            System.out.println("Exception Generated");
        }
        finally{
            System.out.println("Sum is :" +obj.result);
        }
    }
}
//Declare a class called Coordinate to have 3 dimensional
//Cartesian coordinates. Define following methods : - Constructor(s)
//- add_coordinates to add two Coordinate objects and to produce resultant object.
//Generate and handle exception if all three coordinates of the resultant 
//Coordinate object are zero. Define method main to show use of above methods.
//(Dec-2015- OLD)[NLJIET] 07