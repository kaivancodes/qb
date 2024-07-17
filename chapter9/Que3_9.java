import java.io.File;
import java.io.FileOutputStream;

public class Que3_9 {

    public static void main(String[] args) {
        File file = new File("/Users/kaivanshah/Documents/College/Sem-4/O.O.P. 1/Input_Output/Reverse.txt");
        try{
            FileOutputStream os = new FileOutputStream(file);
            String string = "Reverse String";
            byte[] arr = string.getBytes();
            os.write(arr);

            os.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
//Write a program to display the bytes of a file in reverse sequence.
//Provide the name of the file as a command line argument. 
//(Use RandomAccessFile) (Jun-2012-OLD)[NLJIET] 07