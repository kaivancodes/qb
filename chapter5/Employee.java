public class Employee 
{
	private String identity;
	private String Name;
	private double monthlySalary;
	
	public Employee(String id, String name, double msalary)
	{
		identity = id;
		Name = name;
		monthlySalary = msalary;
		
		if (msalary < 0.0)
			monthlySalary = 0.0;
	}
	
	public void setID(String id)
	{
		identity = id;
	}
	
	public String getID()
	{
		return identity;
	}
	
	public void setName(String name)
	{
		Name = name;
	}
	
	public String getName()
	{
		return Name;
	}
	
	public void setMonthlySalary(double msalary)
	{
		monthlySalary = msalary;
	}
	
	public double getMonthlySalary()
	{
		return monthlySalary;
	}
	
	public double getYearlySalary()
	{
		double yearlySalary = monthlySalary * 12;
		return yearlySalary;
	}
	
	public double getRaiseSalary()
	{
		double raiseSalary = getYearlySalary() * 0.1+ getYearlySalary();
		return raiseSalary;
	}
	public void displayEmployee(){
		
		System.out.printf( "\nYearly salary of %s %s: %.2f\n", getID(), getName(), getYearlySalary());
		
		System.out.println();
		
		System.out.println( "***** Giving 10% raise for each employee *****" );
		System.out.printf( "Yearly salary of %s %s: %.2f\n\n\n", getID(), getName(), getRaiseSalary());
	}	
}

//Create a class called Employee that includes:
//I. Three instance variables— id (type String), name (type String)
//and monthly_salary (double).
//II. A default constructor that initializes the three instance variables.
//III. A setter and a getter method for each instance variable
//(for example for id variable void setId(String id), String getId( )).
//IV. displayEmployee() method for displaying employee details.
//Write a driver class named EmployeeTest that demonstrates class Employee’s capabilities.
//Create two Employee objects and display each object’s yearly salary. 
//Then give each Employee a 10% raise and display each Employee’s yearly salary again.
//(Jul-2023-NEW)[NLJIET] 07