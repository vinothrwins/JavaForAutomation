package variables;
/*
 * 1. Declaration : Inside the class and outside the method
 * 2. Values of the variables changes from object to object
 * 3. It is also called as Object Level Variables
 * 4. It will be stored in the HEAP Memory
 * 5. For every object separate copy of instance variable is created
 * 6. If the value is not declared for int - default value = 0
 * 7. If the value is not declared for String - default value = Null
 */
public class InstanceVariable {

	// Employer Details - Instance Variables 
	String empNameOne = "Pranav";
	int empNumOne = 234567;
	float empSalaryOne = (float) 10000000000.50;
	int empMobileNumOne ;
	String empAddressOne; 
		
	String empNameTwo= "Vinoth";
	int empNumTwo = 233124;
	float empSalaryTwo = (float) 10000000000.75;
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Creating the instance of object
	// ClassName objectName = new ClassName Constructor()
	InstanceVariable empOne = new InstanceVariable();
	System.out.println("Employer Name is "+ empOne.empNameOne);
	System.out.println("Employer ID is "+ empOne.empNumOne);
	System.out.println("Employer Salary is "+ empOne.empSalaryOne);
	System.out.println("Employer Mobile Number is "+ empOne.empMobileNumOne);
	System.out.println("Employer Address is "+ empOne.empAddressOne);	
	System.out.println("*****************************");	
	
	InstanceVariable empTwo = new InstanceVariable();
	System.out.println("Employer Name is "+ empTwo.empNameTwo);
	System.out.println("Employer ID is "+ empTwo.empNumTwo);
	System.out.println("Employer Salary is "+ empTwo.empSalaryTwo);
	System.out.println("*****************************");
	
	}

}
