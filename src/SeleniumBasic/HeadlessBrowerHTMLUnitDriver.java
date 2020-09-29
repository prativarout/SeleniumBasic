package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver; 

public class HeadlessBrowerHTMLUnitDriver {

	public static void main(String[] args) {
	System.getProperty("webdriver.chrome.driver","F://My Applications Data//SeleniumWorkSpace//SleniumLearn//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
//	WebDriver driver = new HtmlUnitDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println("Before" + driver.getTitle());
		
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("prativa.r15792");
		driver.findElement(By.id("pass")).sendKeys("abc");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten password')]")).click();
		
		System.out.println("After" + driver.getTitle());
		driver.close();

	}

}
