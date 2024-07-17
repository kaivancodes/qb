class NegativeException extends Exception{
    NegativeException(String msg){
        super(msg);
    }
}

class DivisibleException extends Exception{
    DivisibleException(String msg){
        super(msg);
    }
}

class ThousandsException extends Exception{
    ThousandsException(String msg){
        super(msg);
    }
}

class SeventhousandsException extends Exception{
    SeventhousandsException(String msg){
        super(msg);
    }
}

public class Que7_6 {
    public static void main(String[] args) {
        // int n = Integer.parseInt(args[0]);
        int number[] = new int[5];
        for(int i = 0; i < number.length; i++){
            number[i]=Integer.parseInt(args[i]);
        }
        int sum = 0;
        for(int i = 0; i < number.length; i++){
            try {
                if(number[i] < 0){
                    throw new NegativeException("Number is Negative.");
                }
                if(number[i] % 10 == 0){
                    throw new DivisibleException("Number is divisible by 10.");
                }
                if(number[i] > 1000 && number[i] < 2000){
                    throw new ThousandsException("Number is between 1000 & 2000.");
                }
                if(number[i] > 7000){
                    throw new SeventhousandsException("Number is above 7000.");
                }
            }

            catch (NegativeException e) {
                System.out.println(e);
                number[i] = 0;
            }

            catch (DivisibleException e) {
                System.out.println(e);
                number[i] = 0;
            }

            catch (ThousandsException e) {
                System.out.println(e);
                number[i] = 0;
            }

            catch (SeventhousandsException e) {
                System.out.println(e);
                number[i] = 0;
            }
        }
    }
}
// Write a complete program to accept N integer numbers from the command line.
// Raise and handle exceptions for following cases : 
// - when a number is –ve
// - when a number is evenly divisible by 10
// - when a number is greater than 1000 and less than 2000
// - when a number is greater than 7000
// Skip the number if an exception is raised for it, otherwise add it to find total sum. 
// (Nov- 2016-OLD)[NLJIET] 07