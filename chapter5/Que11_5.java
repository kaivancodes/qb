public class Que11_5
{
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee( "John", "Smith", 5000.00 );
		Employee emp2 = new Employee( "Jane", "Doe", 8000.00 );
		emp1.displayEmployee();
		emp2.displayEmployee();
	}
}
//Create a class called Employee that includes:
//I. Three instance variables— id (type String), name (type String) and monthly_salary(double).
//II. A default constructor that initializes the three instance variables.
//III. A setter and a getter method for each instance variable
//(for example for id variable void setId(String id), String getId( )).
//IV. displayEmployee() method for displaying employee details.
//Write a driver class named EmployeeTest that demonstrates class Employee’s capabilities.
//Create two Employee objects and display each object’s yearly salary.
//Then give each Employee a 10% raise and display each Employee’s yearly salary again.
//(Jul-2023-NEW)[NLJIET] 07