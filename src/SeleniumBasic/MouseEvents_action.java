package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents_action {

	public static void main(String[] args) {
		
System.getProperty("webdriver.chrome.driver","F://My Applications Data//SeleniumWorkSpace//SleniumLearn//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.get("https://www.goindigo.in/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.linkText("Book"))).build().perform();
		
		driver.findElement(By.xpath("//*[@title='About booking online']")).click();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		

	}

}
