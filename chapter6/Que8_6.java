abstract class Vegetable{
    String color;
    abstract public String toString();
}

class Potato extends Vegetable{

    @Override
    public String toString() {
        color = "YELLOW";
        return color;
    }
}

class Brinjal extends Vegetable{

    @Override
    public String toString() {
        color = "PURPLE";
        return color;
    }
}

class Tomato extends Vegetable{

    @Override
    public String toString() {
        color = "RED";
        return color;
    }
}

public class Que8_6 {
    public static void main(String[] args) {
        Vegetable p = new Potato();
        Vegetable b = new Brinjal();
        Vegetable t = new Tomato();
        System.out.println("The Color of Potato is: "+p.toString());
        System.out.println("The Color of Brinjal is: "+b.toString());
        System.out.println("The Color of Tomato is: "+t.toString());
    }
}
//The abstract Vegetable class has three subclasses named Potato, Brinjal and Tomato.
//Write an application that demonstrates how to establish this class hierarchy.
//Declare one instance variable of type String that indicates the color of a vegetable.
//Create and display instances of these objects. Override the toString() method of
//Object to return a string with the name of the vegetable and its color.
//(Nov-2011-OLD)(May-2016-OLD)[NLJIET] 07