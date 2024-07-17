import java.util.Scanner;

class student {

    int id_no,no_of_subjects;
    int subject_code[];
    int subject_credits[];
    int grade_obtained[];
    double spi;
    
    student(){}
    
    student(int id,int num)
    {
        id_no = id;
        no_of_subjects = num;
        
        subject_code = new int[num];
        subject_credits = new int[num];
        grade_obtained = new int[num];
    }
    
    public void getdetails()
    {
        int i;
        Scanner scan = new Scanner(System.in);
        for(i=0;i<this.no_of_subjects;i++)
        {
            System.out.println("Enter detail for subject# : " + i+1);
            System.out.print("Enter code : ");
            this.subject_code[i]=scan.nextInt();
            System.out.print("Enter credits : ");
            this.subject_credits[i]=scan.nextInt();
            System.out.print("Enter obtained grade : ");
            this.grade_obtained[i]=scan.nextInt();
            
            scan.close();
        }
    }
    
    private void calculate()
    {
        int points;
        points=0;
        int credits=0;
        int i;
        for(i=0;i<this.no_of_subjects;i++)
        {
            points+=(this.subject_credits[i]*this.grade_obtained[i]);
            credits+=this.subject_credits[i];
        }
        this.spi=(double)points/credits;
    }
    
    public void display()
    {			
        calculate();
        System.out.println("Hello ur ID is : " + id_no + "and you have scored : " + spi);
    }

    public void studentdet(int id, int num) {
        id_no = id;
        no_of_subjects = num;
        subject_code = new int[num];
        subject_credits = new int[num];
        grade_obtained = new int[num];
    }
}

public class Que3_4_4 {
    public static void main(String[] args) {
        
        int count=Integer.parseInt(args[0]);
		
		System.out.println("Hello.. :) You have selected to enter the details of " + count + " students!");
		
		int i=0;
			
		Scanner scan=new Scanner(System.in);
		
		int id,num;
		
		student sarray = null;
		
		for(i=0;i<count;i++)
		{
			System.out.println("For student# " + (i+1) + " Enter details below!");
			System.out.print("Enter ID number : ");
			id=scan.nextInt();
			System.out.print("Enter number of subjects : ");
			num=scan.nextInt();
			
			sarray=new student(id,num);
			sarray.getdetails();
			sarray.display();

            scan.close();
		} 
    }
}
// It is required to compute SPI (semester performance index) of n students of a 
// class for their registered subjects in a semester.
// Assume that all students register for 6 subjects and each subject carry 5 credits.
// Also, follow GTU convention and method for computation of SPI.
// Declare a class called student having following data members:
// id_no, grades_obtained and spi.
// Define constructor, display and calculate_spi methods. Define main 
// to process data of n students. (Nov-2016-OLD)[NLJIET] 07