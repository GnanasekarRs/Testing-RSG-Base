package buttonsANDboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxMultiCheck {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gnanasekar Rs\\Desktop\\Udemy\\Drivers\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://www.spicejet.com/");
	    
	    for(int i=1;i<=5;i++)
	    {
	    	boolean boo = driver.findElement(By.xpath("//div[@id='discount-checkbox']/div["+i+"]")).isSelected();
	    //if its selected then true
	    //if its not checked then false
	    //in this site we check only 1 check box @ a time
	    if(boo == false)
	    {
	    	driver.findElement(By.xpath("//div[@id='discount-checkbox']/div["+i+"]")).click();
	    }
	    else
	    {
	    	driver.findElement(By.xpath("//div[@id='discount-checkbox']/div["+i+"]")).clear();
	    }
	    }
	    
	}

}
