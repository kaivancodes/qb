import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class Que1_9 {
    public static void main(String[] args) 
    {
        File file = new File("/Users/kaivanshah/Documents/College/Sem-4/O.O.P. 1/Input_Output/Hello.txt");
        File file2 = new File("/Users/kaivanshah/Documents/College/Sem-4/O.O.P. 1/Input_Output/Hello2.txt");

        try{

            FileOutputStream os = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(os);
            String str = "Hello World";
            byte[] arr = str.getBytes();
            bos.write(arr);
            System.out.println("File Write Successfully");

            bos.flush();
            bos.close();
            os.flush();
            os.close();

            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis); 
            byte arr3[] = new byte[bis.available()];
            bis.read(arr3);

            bis.close();
            fis.close();

            System.out.println(new String(arr3));
            System.out.println(Arrays.toString(arr3));

            FileOutputStream fos = new FileOutputStream(file2);
            BufferedOutputStream bof = new BufferedOutputStream(fos);
            bof.write(arr3);

            System.out.println("Data Transfered Successfully");

            bof.close();
            fos.close();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
// Write a program using BufferedInputStream, FileInputStream, BufferedOutputStream,
// FileOutputStream to copy Content of one file File1.txt into another file File2.txt. 
// (Jun- 2012-OLD)(May-2018-OLD)[NLJIET]