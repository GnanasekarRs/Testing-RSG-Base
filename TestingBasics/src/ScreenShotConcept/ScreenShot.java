package ScreenShotConcept;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		
		    System.setProperty("webdriver.chrome.driver","D:\\\\Sekar\\\\sekar Project Backups\\\\Escllipse\\\\ChromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
			    
		    WebDriver driver = new ChromeDriver();
		    
		    driver.get("http://google.com");
		    
		    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    //We can't give C Drive Directly,its throw Access Denied Error
		    FileUtils.copyFile(src,new File("C:\\Users\\Indium\\Desktop\\screenshot.png"));
		    FileUtils.copyFile(src,new File("D://screenshot.png"));

	}

}
