package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ElementVisibiltyConcept {

	public static void main(String[] args) {
	System.getProperty("webdriver.chrome.driver","F://My Applications Data//SeleniumWorkSpace//SleniumLearn//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Boolean CreateAccount = driver.findElement(By.name("websubmit")).isDisplayed();
		System.out.println(CreateAccount);
		
		Boolean LoginBtn = driver.findElement(By.id("u_0_b")).isEnabled();
		System.out.println(LoginBtn);
		

		driver.findElement(By.id("u_0_6")).click();
		Boolean RadBtn = driver.findElement(By.id("u_0_6")).isSelected();
		System.out.println(RadBtn);
		
		//Select
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select select = new Select(month);
		
		select.selectByVisibleText("Nov");
		
		
		
		
		
	}

}
