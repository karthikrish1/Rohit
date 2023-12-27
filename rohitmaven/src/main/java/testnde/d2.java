package testnde;

import org.testng.annotations.Test;

public class d2 {

	
	//dependsogroups: create connection between test cases and group
	
	
		@Test(priority=0,groups="lg")
	    public void t1()
		{
			System.out.println("tc1 ");
		}

		@Test(priority=1,groups="lg")
		public void tc2()
		{
			System.out.println("tc2 ");
		}
		
		
		@Test(priority=3,dependsOnGroups="lg")
		public void hm()
		{
			System.out.println("home");
		}
		
}
