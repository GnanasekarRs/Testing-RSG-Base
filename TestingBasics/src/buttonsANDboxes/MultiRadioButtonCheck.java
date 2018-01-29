package buttonsANDboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiRadioButtonCheck {

	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Gnanasekar Rs\\Desktop\\Udemy\\Drivers\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://www.spicejet.com/");
	    int size = driver.findElements(By.xpath("//div[@id='travelOptions']/table/tbody/tr/td")).size();
        System.out.println("Number of Radio Buttons "+size);
        
        for(int j =1; j<=5;j++)   //suma radio box check pana multi loop
        {
        for (int i=1;i<=size;i++)
        {
        	driver.findElement(By.xpath("//div[@id='travelOptions']/table/tbody/tr/td["+i+"]")).click();
        }
        }
	}

}
