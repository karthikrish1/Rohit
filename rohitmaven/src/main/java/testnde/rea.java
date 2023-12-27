package testnde;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class rea {

	ChromeDriver ob;
	@Test(priority=0,description="visiting website",groups="P1")
	public void visiting()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//step2: create an object for chromedriver class
		 ob= new ChromeDriver();
		//step3: visiting 
		ob.get("http://www.google.com");
	}
	
	@Test(priority=1,description="maximsng website",groups="P1")
	public void max()
	{
		ob.manage().window().maximize();
	}

	@Test(priority=2,description="refreshing website",invocationCount=3,groups="P1")
	public void refresh()
	{
		ob.navigate().refresh();
	}
	
	@Test(priority=3,description=" searching",dependsOnGroups="P1")
	public void sending()
	{
		ob.findElementByName("q").sendKeys("selenium");
	}
	
	@Test(priority=4,description="closing website",dependsOnGroups="P1",timeOut=4000)
	public void close() throws InterruptedException
	{
		Thread.sleep(2000);
		ob.quit();
	}
}
