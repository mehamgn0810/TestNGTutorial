package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots {
	
	public static String takeScreenshot(WebDriver driver, String name) throws IOException {
		String directory = "C:\\Users\\MEHAVARNAN\\Documents\\eclipse-workspace\\TestNGTutorial\\screenshots\\";
		String fileName = name + ".png";
		File destFile = new File(directory + fileName);
		TakesScreenshot ss = (TakesScreenshot)driver;
		File sourceFile = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, destFile);
		return directory + fileName;
	}

}
