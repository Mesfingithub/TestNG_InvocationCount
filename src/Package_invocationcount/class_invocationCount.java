package Package_invocationcount;

import org.testng.annotations.Test;

public class class_invocationCount {
	@Test(invocationCount = 6) 				// to print the test case six times using invocation count key word 
	public void Test01() {
		System.out.println("I am in Test01");
		
	
		
	}

}
