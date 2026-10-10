package utilities;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testCases.BaseTest;

public class ReportsManager implements ITestListener {

	ExtentSparkReporter spark;
	ExtentReports reports;
	ExtentTest test;
	public WebDriver driver;

	public void onStart(ITestContext context) {

		spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/Reports/report.html");
		spark.config().setDocumentTitle("Test Report");
		spark.config().setReportName("Shanmukesh");
		spark.config().setTheme(Theme.DARK);

		reports = new ExtentReports();
		reports.attachReporter(spark);

		reports.setSystemInfo("Browser", "Chrome");

	}

	public void onTestSuccess(ITestResult result) {

		test = reports.createTest(result.getName());
		test.log(Status.PASS, result.getName() + " is passed successfully");

	}

	public void onTestFailure(ITestResult result) {

		Screenshot sc = new Screenshot(BaseTest.driver);

		ExtentTest test = reports.createTest(result.getName()).createNode("Expand to View details")
				.addScreenCaptureFromPath(sc.captureScreenshot(result.getName()));
		test.log(Status.FAIL, result.getThrowable());

	}

	public void onTestSkipped(ITestResult result) {

		test = reports.createTest(result.getName());
		test.log(Status.SKIP, result.getName() + " is Skipped ");

	}

	public void onFinish(ITestContext context) {
		reports.flush();
	}

}
