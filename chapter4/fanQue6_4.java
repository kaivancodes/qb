public class fanQue6_4{
    public static final int SLOW = 1, MEDIUM = 2, FAST = 3;
    int Speed;
    boolean f_on;
    double radius;
    String color;

    fanQue6_4(){
        Speed = SLOW;
        f_on = false;
        radius = 4;
        color = "Blue";
    }
    fanQue6_4(int Speed, double radius, String color, boolean f_on){
        this.Speed = Speed;
        this.radius = radius;
        this.color = color;
        this.f_on = f_on;
    }
    void display(){
        if(f_on == true){
            System.out.println("Fan is on.\nThe Speed is: "+Speed+"\nThe Color is: "+color+"\nThe Radius is: "+radius);
        }
        else{
            System.out.println("Fan is off.\nThe Color is: "+color+"\nThe Radius is: "+radius);
        }
    }
    public static void main(String[] args) {
        fanQue6_4 fan1 = new fanQue6_4();
        fan1.display();
        fanQue6_4 fan2 = new fanQue6_4(MEDIUM, 6, "Brown", true);
        fan2.display();
    }
}
// Design a class named Fan to represent a fan. The class contains:
// - Three constants named SLOW, MEDIUM and FAST with values 1,2 and 3 to
// denote the fan speed.
// - An int data field named speed that specifies the speed of the fan (default SLOW).
// - A boolean data field named f_on that specifies whether the fan is on(default false).
// - A double data field named radius that specifies the radius of the fan (default 4).
// - A data field named color that specifies the color of the fan (default blue).
// - A no-arg constructor that creates a default fan.
// - A parameterized constructor initializes the fan objects to given values.
// - A method named display() will display description for the fan. If the fan is on, 
// the display() method displays speed, color and radius. If the fan is not on, 
// the method returns fan color and radius along with the message “fan is off”. 
// Write a test program that creates two Fan objects. One with default values and the other 
// with medium speed, radius 6, color brown, and turned on status true. Display the descriptions 
// for two created Fan objects. (Nov-2011- OLD)[NLJIET] 07