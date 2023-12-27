package testngat;

import org.testng.annotations.Test;

public class t1 {
	/*testng: test next generation
	 *testing framework
	 *test cases 
	 *automatic report generation
	 *parllel, suite, 
	 *inspired from JUNIt
	 *
	 *
	 *functions
	 *    test cases
	 *    nonstatic
	 *    @Test
	 *    default order: alphabetical
	 * * 
	 * priority: arrange the test case in a particular order
	 * description: add short note on the test case
	 * 
	 * groups 
	 * invocationcount: run the same test case for multiple tme
	 * 
	 * enabled=false 
	 * */
	
	@Test(priority=0,description="FIRST",groups="L",invocationCount=5,enabled=false)
	public void m1()
	{
		System.out.println("Test case 1");
	}
	
	@Test(priority=1,groups="L")
	public void ab()
	{
		System.out.println("Test case 2");
	}
	
	@Test(priority=2,description="THRDDD",groups="K")
	public void m2()
	{
		System.out.println("Test case 3");
	}

}
