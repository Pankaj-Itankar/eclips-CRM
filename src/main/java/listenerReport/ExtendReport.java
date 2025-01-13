package listenerReport;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import jdk.internal.org.jline.utils.Log;

public class ExtendReport implements ITestListener{
	
	    @Override
	    public void onTestStart(ITestResult result) {
	        // Called when a test method starts
	        Reporter.log("Test Started: " + result.getName(), true);
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        // Called when a test method is successful
	        Reporter.log("Test Passed: " + result.getName(), true);
	        Log.info("Testcase is Passed"+result.getName());
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        // Called when a test method fails
	        Reporter.log("Test Failed: " + result.getName(), true);
	        Reporter.log("Error: " + result.getThrowable(), true);
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        // Called when a test is skipped
	        Reporter.log("Test Skipped: " + result.getName(), true);
	    }

	    @Override
	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	        // Called when a test fails but is within success percentage (if used)
	        Reporter.log("Test Failed But Within Success Percentage: " + result.getName(), true);
	    }

	    @Override
	    public void onStart(ITestContext context) {
	        // Called before any tests start in the suite
	        Reporter.log("Test Suite Started: " + context.getName(), true);
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	        // Called after all tests have finished in the suite
	        Reporter.log("Test Suite Finished: " + context.getName(), true);
	    }
	

	

}
