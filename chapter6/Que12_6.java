
import java.io.File;
import java.io.IOException;

public class Que12_6 {
    public static void main(String[] args) throws IOException {
        File fobj = new File(args[0]);
        boolean isFile = fobj.isFile();
        boolean isDirectory = fobj.isDirectory();
        if(isFile){
            System.out.println(fobj.getPath() + " is a file.");
            long length = fobj.length();
            System.out. println("In The size of the file is: "+length +" Bytes");
        }
        else if(isDirectory){
            System.out.println(fobj.getPath() + " is a directory");
            String[] s = fobj.list();
            System.out.println("In It Contains...");
            for (int i=0; i < s.length; i++){
                File f = new File (fobj.getAbsolutePath() + "/" + s[i]);
                if (f.isDirectory ()){
                    System.out.println(s[i] + " as a directory");
                }
                else{
                    System.out.println(s[i] + "as a file");
                }
            }
        }
        else{
            System.out.println("It is not present as File or Directory.");
        }
    }
}
//Write a program to check whether the name given from the command line is file or not?
//If it is a file then print the size of file and if it is directory then it should
//display the name of all files in it. [NLJIET] 07