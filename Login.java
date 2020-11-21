package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
void signin() {
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://demo.fingress.com:7447/fgdemo/");   
    driver.findElement(By.linkText("Sign In")).click();
    WebElement l = driver.findElement(By.id("abbvName"));
    l.sendKeys("MAHINDRA");   
    WebElement k = driver.findElement(By.id("username"));
    k.sendKeys("MAKER");  
    WebElement j = driver.findElement(By.id("password"));
    j.sendKeys("1234");  
    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/form/div[4]/p/button")).click();
    
    
}
}


