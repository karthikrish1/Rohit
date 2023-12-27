package testngwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class e1 {

	/*explicit wait: conditional synchronisation
	 * 
	 * create an object for webdriver wait class
	 * pass driver instance and time limit as inout
	 * call until method
	 * call conditions
	 *  
	 * code is correct: executes within time limit, it will proceed further, will not wait for completion of time limit
	 * code is wrong : will wait for the completion of time limit, then it throws up error
* 
	 * */
	
	@Test
	public void t1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//step2: create an object for chromedriver class
		 ChromeDriver ob = new ChromeDriver();
		//step3: visiting 
		ob.get("http://www.google.com");
		WebDriverWait w= new WebDriverWait(ob,5);
		
		//title
		//w.until(ExpectedConditions.titleIs("Google"));//5
		
		//w.until(ExpectedConditions.titleContains("oo"));//5
		
		//alert
		//w.until(ExpectedConditions.alertIsPresent());
		
		//visibility of element 
		//find , visibility
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Images")));
		
		//visibility of more elements
		//images, visibility
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img")));
		
		//element is clickabke or not
		//w.until(ExpectedConditions.elementToBeClickable(By.linkText("Gmail")));
		
		//number of elements 
		w.until(ExpectedConditions.numberOfElementsToBe(By.tagName("img"), 2));
		ob.quit();
		
	}
}
