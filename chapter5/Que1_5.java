import java.util.Scanner;
class employee{
    int emp_id;
    String emp_name;
}
class salary extends employee{
    String designation;
    double mon_salary;

    salary(){

    }
    salary(int id,String name,String desig,double sal){
        this.emp_id = id;
        this.emp_name = name;
        this.designation = desig;
        this.mon_salary = sal;
    }
    void display()
	{
        if(mon_salary>2000){
            System.out.println("!!------->Employee Details <-------!!");
            System.out.println("ID : " + emp_id);
		    System.out.println("NAME : " + emp_name);
		    System.out.println("Designation : " + designation);
		    System.out.println("Salary : " + mon_salary);
        }
	}
}
public class Que1_5 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.print("How many Employee's Details you want to enter : ");
        int size  = ob.nextInt();
        salary s1[] = new salary[size];
        String e_name,designation;
        int id;
        double sal;
        for(int i = 0; i<s1.length;i++){
            System.out.print("Enter the Employee's name :");
            e_name = ob.next();
            System.out.print("Enter the Employee's id : ");
            id = ob.nextInt();
            System.out.print("Enter the Designation where employee work : ");
            designation = ob.next();
            System.out.print("Enter the Employee's monthly Salary : ");
            sal = ob.nextDouble();
            s1[i]= new salary(id, e_name, designation, sal);
        }
        for (salary s11 : s1) {
            s11.display();
            System.out.println();
        }
        ob.close();
    }
}

// Declare a class called employee having employee_id and employee_name as members.
// Extend class employee to have a subclass called salary having designation and
// monthly_salary as members. Define following:
// - Required constructors
// - A method to find and display all details of employees drawing salary more than Rs. 20000/-
// - Method main for creating an array for storing these details given 
//   as command line arguments and showing usage of above methods. (Jun-2011-OLD)[NLJIET] 07