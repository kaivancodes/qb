import java.util.Arrays;
import java.util.Scanner;

public class Que9_3 {
    int searchString(String s, String arr[]) { // [a,b,c,d,s] // d  // search

        for (int i = 0; i < arr.length; i++) {
            if (s.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }
    
    String[] sort(String arr[]) { // [a,b,c,d,s] // d // sort
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Ten Names:");
        String name[] = new String[10];
        for (int i = 0; i < name.length; i++) {
            name[i] = sc.nextLine();
        }

        System.out.println("Original Array : " + Arrays.toString(name));
        Que9_3 obj = new Que9_3();

        System.out.println("Enter a name to search:");
        String search = sc.nextLine();

        int index = obj.searchString(search, name);

        if (index != -1) {
            System.out.println("Name found at index " + index);
        } else {
            System.out.println("Name not found");
        }

        String sortedArray[] = obj.sort(name);
        System.out.println("Sorted Array : "+ Arrays.toString(sortedArray));
        sc.close();
    }
}
// Implement java code to take some (say 10) Strings from users.
// Put all the input Strings in an array (String name[]).
// Provide implementation of following methods:
// (i)search(String s) will return index of String passed in
// method if String S is found in name, otherwise return -1.
// (ii)sort() will print sorted String array to user
// (Jan-2024-NEW)[NLJIET] 07