public class Que2_3{
    public static void main(String[] args) {
    int a [] = {10,20,30,40};
    int avg = 0, sum = 0;
    for(int i = 0; i < a.length; i++){
    sum = sum + a[i];
    avg = sum/(a.length);
    }
    System.out.println("Sum =" +sum+ " Average="+avg);
    }
}
//Write a program that creates and initializes a four integer element array.
//Calculate and display the average of its values. (Dec-2015-OLD)[NLJIET] 05