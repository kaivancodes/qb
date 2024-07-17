import java.util.Scanner;

public class Que8_3 {
    int x=2;
    public static int add(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum = sum+array[i];
        }
        System.out.println("Sum is:"+sum);
        return -1;
    }
    public static int max(int[]array){
        int max=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>max);{
                max=array[i];
            }
        }
        System.out.println("Maximum:"+max);
        return -1;
    }
    public static int search(int[] array, int key){
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements:");
        int n = sc.nextInt();
        // int[] arr={1,2,3,4,5,6,7,8,9,10};
        int arr[] = new int[n];
        System.out.println("Enter Elements:");
        for(int i = 0; i < arr.length; i++){
            arr[i]= sc.nextInt();
        }
        add(arr);
        max(arr);
        System.out.print("Enter number to find:");
        int s = sc.nextInt();
        System.out.println(search(arr, s));
        // System.out.println(search(arr, 5));
        sc.close();
    }
}
//Write a program which declare integer array of 10 elements? Initialize array 
//and define following methods with the specified header:
//(i) public static int add(int [] array) print addition of all element of array.
//(ii) public static int max(int [] array) print maximum element of array.
//(iii) public static int search(int [] array, int key) search element key in array and return index of it.
//If element is not found method will return -1.