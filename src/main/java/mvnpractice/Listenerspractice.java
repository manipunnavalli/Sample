package mvnpractice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenerspractice implements ITestListener{

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult Result) {
		System.out.println("FAiled testcase is  :" +Result.getName());
		
	}

	public void onTestSkipped(ITestResult Result) {
		System.out.println("Skipped Testcase is :"+ Result.getName());
		
	}

	public void onTestStart(ITestResult Result) {
		System.out.println("strated Testcase is :"+Result.getName());
		
	}

	public void onTestSuccess(ITestResult Result) {
		System.out.println("Executed Testcase is :"+Result.getName());
		
	}

}
