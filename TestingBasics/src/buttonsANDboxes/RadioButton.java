package buttonsANDboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gnanasekar Rs\\Desktop\\Udemy\\Drivers\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://www.spicejet.com/");
	    
	    driver.findElement(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip' and @value='OneWay']")).click();
		
		

	}

}
