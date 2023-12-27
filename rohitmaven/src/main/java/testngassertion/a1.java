package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testnglistener.e1.class)
public class a1 {

	//assertion: technqiue where we will be comparing actual result with obtained result
	// hard asserts
	//           provided by assert builtin class
	//           static in nature
	//           assertion fails, it will fail the test case
	
	// soft asserts
	 //           provided by softassert builtin class
	//            nonstatic in nature
	//            even if assertion fails, it will proceed
	//           invoke assertAll()
	
	
	//assertEqual(actual, expected)
	//assertNotEqual(actual, expected)
	//assertTrue(condition)
	// assertFalse(condition)
	
	
	@Test
	public void t1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//step2: create an object for chromedriver class
		 ChromeDriver ob = new ChromeDriver();
		//step3: visiting 
		ob.get("http://www.google.com");
		//Assert.assertEquals(ob.getTitle(), "rohit");
		Assert.assertNotEquals(ob.getTitle(), "rohit");
		WebElement ele = ob.findElementByLinkText("Images");
		Assert.assertTrue(ele.isDisplayed());
		Assert.assertFalse(ele.isSelected());
		ob.quit();
	}
	
	@Test
	public void t2()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//step2: create an object for chromedriver class
		 ChromeDriver ob = new ChromeDriver();
		 ob.get("http://www.facebook.com");
	}
}
