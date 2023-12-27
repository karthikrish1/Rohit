package testngat;

import org.testng.annotations.Test;

public class vt {
	
	@Test(timeOut=2000)
	public void m1() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("Test case 1");
	}
	
}
