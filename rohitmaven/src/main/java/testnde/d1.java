package testnde;

import org.testng.annotations.Test;

public class d1 {
	
	//dependsonmethods: create connection between test cases
	
	
	@Test(priority=0)
	public void v1()
	{
		System.out.println("visiting website ");
	}

	@Test(priority=1,dependsOnMethods="v1")
	public void lgn()
	{
		System.out.println("login ");
	}
	
	//v1: pass    lgn: execute
	//v1: fail    lgn: skipping
}
