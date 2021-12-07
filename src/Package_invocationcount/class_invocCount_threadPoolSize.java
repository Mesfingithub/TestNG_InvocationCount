package Package_invocationcount;

import org.testng.annotations.Test;

public class class_invocCount_threadPoolSize {
	@Test(invocationCount = 6, threadPoolSize = 3)       // print six times with batch size of three 
	public void Test01() {
		System.out.println("I am in Test01 - Thread ID = "+ Thread.currentThread().getId());
	}

}
