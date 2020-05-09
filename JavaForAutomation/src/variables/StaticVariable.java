package variables;

/*
 * 1. Declaration : Inside the class and outside the method
 * 2. Single copy will be created at the class level.
 * 3. It will be declared usign static keyword
 * 4. It is also called as Class Level Variables
 * 5. If the value is not declared for int - default value = 0
 * 6. If the value is not declared for String - default value = Null
 * 7. No need to create the object instance
 */

public class StaticVariable {

	// Employer Details - Instance Variables 
	String empNameOne = "Pranav";
	int empNumOne = 234567;
	float empSalaryOne = (float) 10000000000.50;
	int empMobileNumOne ;
	String empAddressOne; 
		
	String empNameTwo= "Vinoth";
	int empNumTwo = 233124;
	float empSalaryTwo = (float) 10000000000.75;
		
	// Static Variable
	static String companyName = "Google";
	static int companyRegNum= 2323232;
		
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating the instance of object
		// ClassName objectName = new ClassName Constructor
		InstanceVariable empOne = new InstanceVariable();
		System.out.println("Employer Name is "+ empOne.empNameOne);
		System.out.println("Employer ID is "+ empOne.empNumOne);
		System.out.println("Employer Salary is "+ empOne.empSalaryOne);
		System.out.println("Employer Mobile Number is "+ empOne.empMobileNumOne);
		System.out.println("Employer Address is "+ empOne.empAddressOne);	
		System.out.println("*****************************");
	
		// Calling the static variable
		System.out.println("**Displaying Static Variables Values");
		System.out.println("The Company name is "+ companyName);
		System.out.println("The Company ID is "+ companyRegNum);

	}

}
