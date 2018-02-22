package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.corba.se.spi.orbutil.fsm.Action;

public class popupVerificaions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Sekar\\sekar Project Backups\\Escllipse\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement b=driver.findElement(By.xpath("//span[contains(text(),'Your Orders') and @class='nav-line-2']"));
		Actions a = new Actions(driver);
		a.moveToElement(b).build().perform();
		/*
		 * When move the cursor then popup will occur
		 * Action will used for drag and drop,move mouse over the Element
		 * Here WebElement b=driver.findElement(By.xpath("//span[contains(text(),'Your Orders') and @class='nav-line-2']"));
		 * we store xpath in the Webelement and we can pass where in parameter
		 * 
		 */
		 
	}
                                                                                                                                                          
}
