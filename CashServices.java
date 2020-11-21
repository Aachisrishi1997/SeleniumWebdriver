package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CashServices{
public void csm() {	
	System.setProperty("webdriver.chrome.driver" , "C:\\Rishi\\Java\\Testing\\chromedriver_win32\\chromedriver.exe");
	Login signin = new Login();
	signin.signin();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://demo.fingress.com:7447/fgdemo/fgClassic#/fgLayoutPage?pageId=4fb1a4af-6c25-413e-bef5-4b9549632f9d&appId=149d07b3-5bb6-4332-b9d3-8e34369db66f&roles=%5B%22APPLICANT%22,%22CUSTOMER%22%5D&typeCode=FG_ACCOUNT_MANAGEMENT&subTypeCode=FG_CSM_FIN_ACCOUNT_CURRENT");
}

}

