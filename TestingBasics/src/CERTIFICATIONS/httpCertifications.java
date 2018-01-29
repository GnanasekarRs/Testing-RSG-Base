package CERTIFICATIONS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class httpCertifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    DesiredCapabilities DC = new DesiredCapabilities();
 //   DC.acceptInsecureCerts();
    DC.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
    DC.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
    
    System.setProperty("webdriver.chrome.driver","D:\\\\Sekar\\\\sekar Project Backups\\\\Escllipse\\\\ChromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
    
    ChromeOptions CO = new ChromeOptions();
    CO.merge(DC);
    
    WebDriver driver = new ChromeDriver(CO);
    
	}

}
