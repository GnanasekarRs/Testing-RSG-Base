package buttonsANDboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gnanasekar Rs\\Desktop\\Udemy\\Drivers\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://www.spicejet.com/");
	    
	   boolean boo = driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_Unmr']")).isSelected();
	   if(boo == false)
	   {
		   driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_Unmr']")).click();
	   }
	   else
	   {
		   System.out.println("Check Box is Already in check");
	   }
	}

}
