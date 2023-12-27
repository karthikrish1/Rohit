package testngwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class w1 {

	/*testngwaits/synchronisation tech : conditional , unconditional
	 * 
	 * 
	 * conditional : explicit wait
	 * unconditional : implicit wait
	 * 
	 * implicitwait : once it is declared all the code which is present afte rit will take the time limit
	 * 
	 * code is correct: executes within time limit, it will proceed further, will not wait for completion of time limit
	 * code is wrong : will wait for the completion of time limit, then it throws up error
	 * 
	 * 
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
		ob.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(ob.getTitle());//5
		System.out.println(ob.getCurrentUrl());//5
		ob.navigate().refresh();//5
		ob.findElementByLinkText("rohit"); //5
		ob.quit();//5
		
	}
}
