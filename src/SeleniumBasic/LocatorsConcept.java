package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class LocatorsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.getProperty("webdriver.chrome.driver","F://My Applications Data//SeleniumWorkSpace//SleniumLearn//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form/");
		
		driver.findElement(By.id("firstName")).sendKeys("Prativa");
		driver.findElement(By.id("lastName")).sendKeys("Rout");
		driver.findElement(By.id("userEmail")).sendKeys("prativa.rout@gmail.com");
//		driver.findElement(By.xpath("//input[@id='react-select-3-input'] ")).sendKeys("NCR");
		driver.findElement(By.id("userNumber")).sendKeys("9148842470");
		Select select = new Select(driver.findElement(By.xpath("//input[@id='react-select-3-input'] ")));
		select.selectByIndex(2);
//		select.selectByVisibleText("NCR");
		
		
		
		
//***** Locator - 1 :  linkTest (applicable only for links) ******//	
//	/	driver.findElement(By.linkText("register")).click();
//driver.quit();
	}

}
