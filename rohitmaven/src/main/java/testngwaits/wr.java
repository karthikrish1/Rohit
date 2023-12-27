package testngwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class wr {
	
	 /* explicit wait
	  *    
	  *    createan object for webdriver wait class
	  *    pass driver instance and timelimit  as input
	  *    call untill
	  *    call expected conditions
	  *     
	 * code is correct: executes within time limit,it will proceed further , wont wait for completion of time
	 * code is wrong: will wait for completion of time limit, then it will throw up error 
	 * 
	 * 
	 * */
	@Test
	public void t1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	    driver.get("http:\\www.google.com");
	    WebDriverWait w= new WebDriverWait(driver,5);
	    
	    //title
	    //w.until(ExpectedConditions.titleIs("Gfd"));
	    //w.until(ExpectedConditions.titleContains("oo"));
	    
	    //presence of alert
	   // w.until(ExpectedConditions.alertIsPresent());
	    
	    //visibility of an element
	    // find the element and check its visibility
	   // w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));//5
	    
	    // clickable or not
	   // w.until(ExpectedConditions.elementToBeClickable(By.linkText("Gmail")));
	    
	    //visibility of more elements
	    // collecting all images, checking whether all are visible
	    w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img")));
	    
	    driver.quit();

}}
