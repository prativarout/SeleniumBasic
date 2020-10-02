package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableHandle {

	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver","F://My Applications Data//SeleniumWorkSpace//SleniumLearn//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://ui.cogmento.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("email")).sendKeys("prativarani1111@gmail.com");
		driver.findElement(By.name("password")).sendKeys("prativa@777");
		driver.findElement(By.xpath("//*[@class='ui fluid large blue submit button']")).click();
		driver.findElement(By.xpath("//a[@href='/contacts']")).click();
		 
		driver.findElement(By.xpath("//td[contains(text(),'Abc Abc')]/parent::tr//preceding-sibling::td//input[@type='checkbox']")).click();
		

	}

}
