package testngannotations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class a1 {

	/*before test:   run only once before all the test cases 
	 *after test :   run only once after all the tst cases
	 *
	 *before class:  run only once after  before test 
	 *after class:   run only once before after test 
	 *
	 *before methd: run before each tst case 
	 *after method: run after each test case 
	 *
	 *before test: visiting
	 *before class: maximsin
	 *     before method : refre    tc1: title    aftermethod: deleting cookies
	 *     before method : refre    tc2: click    aftrmethod : deleeting cookies 
	 *after claas: get url
	 *after test : close
	 *  * 
	 * */
	ChromeDriver ob;
	@Test
	public void t1()
	{
		System.out.println("Testcase 1" + ob.getTitle());
	}
	
	
	@Test
	public void t2()
	{
		System.out.println("Testcase 2");
		ob.findElementByLinkText("Images").click();
	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("before test ");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//step2: create an object for chromedriver class
		 ob= new ChromeDriver();
		//step3: visiting 
		ob.get("http://www.google.com");
	}
	
	@AfterTest
	public void at()
	{
		System.out.println("after  test ");
		ob.quit();
	}
	
	@BeforeClass
	public void btc()
	{
		System.out.println("before class ");
		ob.manage().window().maximize();
	}
	
	@AfterClass
	public void atc()
	{
		System.out.println("after class " + ob.getCurrentUrl());
	}
	
	

	@BeforeMethod
	public void btm()
	{
		System.out.println("before method ");
		ob.navigate().refresh();
	}
	
	@AfterMethod
	public void atm()
	{
		System.out.println("after method ");
		ob.manage().deleteAllCookies();
	}
}
