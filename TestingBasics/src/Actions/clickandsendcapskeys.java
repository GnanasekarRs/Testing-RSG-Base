package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Here all will enters in CAPS 
//for number it will enter as symbol
public class clickandsendcapskeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Sekar\\sekar Project Backups\\Escllipse\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		WebElement w =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Actions a = new Actions(driver);
		a.moveToElement(w).keyDown(Keys.SHIFT).sendKeys("Lenovo p2").build().perform();
		
	}

}
