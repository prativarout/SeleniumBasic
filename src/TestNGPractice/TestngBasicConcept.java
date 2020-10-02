package TestNGPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngBasicConcept {
	
	WebDriver driver;

		
@BeforeMethod
public void setup(){
	
	System.getProperty("webdriver.chrome.driver","F://My Applications Data//SeleniumWorkSpace//SleniumLearn//chromedriver.exe");
	
	 driver = new ChromeDriver();
	
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();	
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
}

@Test(priority=2,groups="Title")
public void getTitlePage(){
	System.out.println(driver.getTitle());
}

@Test(priority=1,groups="Login")
public void getLoginBtn(){
	Boolean LgBtn = driver.findElement(By.xpath("//button[@name='login' and @type='submit']")).isEnabled();
	System.out.println(LgBtn);
}


@Test(priority=3,groups="Title")
public void getImgDisplay(){
	Boolean Imgcont = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
	System.out.println(Imgcont);
}

@Test(priority=4,groups="Title")
public void getGroup(){
	System.out.println("groups");
}

@AfterMethod
public void tearDown(){
	driver.quit();
	
}
		
		

	}


