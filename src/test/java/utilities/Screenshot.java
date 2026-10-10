package utilities;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	public WebDriver driver;

	public Screenshot(WebDriver driver) {

		this.driver = driver;

	}

	public String captureScreenshot(String testname) {

		TakesScreenshot snap = (TakesScreenshot) driver;

		File source = snap.getScreenshotAs(OutputType.FILE);

		String filepath = System.getProperty("user.dir") + "/Screenshots/" + testname + ".png";

		File destination = new File(filepath);

		source.renameTo(destination);

		return filepath;

	}

}
