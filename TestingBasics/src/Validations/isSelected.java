package Validations;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.xml.internal.ws.policy.AssertionSet;

/* if the radio Button is selected
 * then it return True 
 * if it fails then it will send false in Boolean
 * so far Tested in UI
*/
public class isSelected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","D:\\Sekar\\sekar Project Backups\\Escllipse\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.spicejet.com/");
        Boolean c =driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).isSelected();
		System.out.println(c);	
		Boolean d = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).isSelected();
		System.out.println(d);
		driver.quit();
		
	}

}
