package variables;

/*
 * 1. It will be declared within the method
 * 2. It will be saved in the stack memory(Stack variable)
 * 3. It will be created while executing the block in which we declared it
 * 4. We cannot access the local variable outside the method
 */
public class LocalVariable {

	void sampleMethod() {
		int a = 10; // Local Variable
		System.out.println(a);
	}
	
	public static void main(String[] args) {

	// Declaring local variable inside main method
	int b = 100;
    System.out.println(b); // It will print the value of b
    
    // Calling the local variables of sampleMethod()
   // System.out.println(a); // It cannot access the local variable outside the method
		
		

	}

}
