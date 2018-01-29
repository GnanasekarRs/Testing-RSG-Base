package Tables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table;

public class TablesCrickbuzz {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gnanasekar Rs\\Desktop\\Udemy\\Drivers\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://www.cricbuzz.com");
	    
	    driver.findElement(By.xpath("//div[@class='cb-col-100 cb-col cb-hm-scg-blk ']/div[1]")).click();
	 
	    driver.findElement(By.xpath("//nav[@class='cb-nav-bar']/a[2]")).click();
	    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    
	    WebElement table=driver.findElement(By.xpath("//*[@class='cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope']/div[2]/div/div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]"));
	    
	    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    int PlayerCount = table.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']")).size();
        //System.out.println(PlayerCount);
        for (int i=1;i<=PlayerCount-2;i++)
        {
        	System.out.println(table.findElements(By.xpath("div[@class='cb-col cb-col-100 cb-scrd-itms']")).get(i).getText());
        	//System.out.println(table.findElements(By.xpath("//*[@class='cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope']/div[2]/div/div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]")).get(i).getText());
        }
	}

}
