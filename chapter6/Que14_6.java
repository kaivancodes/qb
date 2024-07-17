interface Transport{
    public void deliver();
}
abstract  class Animal{
    String item;
    abstract void deliver();
}
class Tiger extends Animal{

    @Override
    void deliver() {   
    }
}
class Camel extends Animal implements Transport{
    Camel(String s){
        item = s;
    }
    @Override
    public void deliver() {
        System.out.println("Camels are used in deserts to carry "+item+".");
    }
}
class Deer extends Animal{

    @Override
    void deliver() {
    }
}
class Donkey extends Animal implements Transport{
    Donkey(String s){
        item = s;
    }
    @Override
    public void deliver() {
        System.out.println("Donkeys can carry "+item+".");
    }
}
public class Que14_6 {
    public static void main(String[] args) {
        Transport[] t = new Transport[4];
        t[1] = new Camel("goods and people");
        t[2] = new Donkey("heavy load");
        System.out.println("Transport interface is implemented by following animals....");
        t[1].deliver();
        t[2].deliver();
    }
}
// The Transport interface declares a deliver () method.
// The abstract class Animal is the superclass of the Tiger, Camel, Deer and Donkey classes.
// The Transport interface is implemented by the Camel and Donkey classes.
// Write a test program that initialize an array of four Animal objects.
// If the object implements the Transport interface, the deliver () method is invoked.
// (Nov-2011-OLD)(Jan-2013-OLD)[NLJIET] 07