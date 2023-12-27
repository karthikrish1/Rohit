package testnglistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class e1  implements ITestListener{

	public void onTestSuccess(ITestResult result) {
		System.out.println("Sucess");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("failed");
	}

	public void onStart(ITestContext context) {
		System.out.println("started");
	}

	public void onFinish(ITestContext context) {
		System.out.println("finished");
	}

	//ITestListener
}
