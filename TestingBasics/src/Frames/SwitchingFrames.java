package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingFrames extends GenericFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Sekar\\sekar Project Backups\\Escllipse\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.forbes.com/leadership/#1a2707521d66");
		
		int j=NumberofFrameCalculate(driver,By.xpath("//*[@id=\"ui-id-2\"]"));
		

        //driver.switchTo().defaultContent();
		//driver.switchTo().frame(j);	
		driver.close();
	}


}

	  class GenericFrame
		{
			static int NumberofFrameCalculate(WebDriver driver,By xpath)
			{
				
			int i;
		    int FrameCount = driver.findElements(By.tagName("iframe")).size();
            System.out.println("Number of Frames ="+" "+FrameCount);
        
            for (i=0;i<FrameCount;i++ )
              {
            	System.out.println(i);
            	driver.switchTo().defaultContent();
        	    driver.switchTo().frame(i);
        	
        		int elementCount = driver.findElements(xpath).size();
        		System.out.println(elementCount);
        		if(elementCount==1)
        		{	
        			driver.findElement(xpath).click();
        			break;	
        		
        		}
        		else
        		{
        			System.out.println("Checking");
        			System.out.println("Loop"+" "+i);
        		}
        		
        	
        }
        	return i;
       
	}
		
}

	


	

