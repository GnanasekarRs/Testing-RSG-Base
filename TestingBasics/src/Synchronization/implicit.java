package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//APllication Down have to verify 

public class implicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Sekar\\sekar Project Backups\\Escllipse\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		try
		{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='H-destination']")).sendKeys("Washington, DC (All Airports)");
		driver.findElement(By.xpath("//input[@id='H-fromDate']")).click();
		driver.findElement(By.xpath("//*[@id=\"H-fromDate-label\"]/div/div/div[2]/table/tbody/tr[4]/td[3]/button")).click();
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='https://alaskatrips.poweredbygps.com/Baltimore-Hotels-Radisson-Hotel-Baltimore-Downtown-Inner-Harbor.h23261.Hotel-Information?chkin=2%2F20%2F2018&chkout=2%2F21%2F2018&rm1=a2&star=0&regionId=6139052&hwrqCacheKey=f7a4492a-7404-4b8d-8c83-faa030c3654eHWRQ1519126086046&vip=false&c=9ee1b3fe-902b-4f7a-94c7-4c1068668464&&exp_dp=89.48&exp_ts=1519126090727&exp_curr=USD&swpToggleOn=false&exp_pg=HSR']")).click();
		driver.close();
		}
		catch(Exception e)
		{
     	System.out.println(e);
     	driver.quit();
		}

	}

}

//Implicit means it will wait max of what we given(time)
//If the particular element get executed before time we given ,no worries it will work
//Excepted time 10 sec to execute Actual time 5 seconds no prb,after 5sec it will move to the next method
