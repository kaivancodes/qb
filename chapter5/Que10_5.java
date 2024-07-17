import java.util.ArrayList;
import java.util.Collections;

public class Que10_5 {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<>();
        System.out.println("Inserting some elements in the Array.");
        obj.add("India");
        obj.add("Sri Lanka");
        obj.add("USA");
        obj.add("Australia");
        obj.add("South Africa");
        System.out.println("Before Sorting: " +obj);
        Collections.sort(obj);
        System.out.println("After Sorting: " +obj);
    }
}
//Write a program to add input elements in ArrayList collection class,
//then sort the inserted elements in descending order and display the sorted output.
//hint:use Collections.reverseOrder() (Jul-2022-NEW)[NLJIET] 07