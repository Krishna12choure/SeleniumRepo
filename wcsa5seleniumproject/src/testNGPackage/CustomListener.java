package testNGPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListener extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {

		Reporter.log("Test Strted", true);

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test Executed Successfully!!", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {

		String methodName = result.getMethod().getMethodName();
		Reporter.log("This Method is Failed taken the screenshot" + methodName, true);
		failedMethod(methodName);

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test skipped", true);

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

		Reporter.log("Test actual Started", true);

	}

	@Override
	public void onFinish(ITestContext context) {

		Reporter.log("Test Finished. ", true);

	}
}
