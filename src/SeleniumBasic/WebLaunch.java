package SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class WebLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.getProperty("webdriver.chrome.driver","F://My Applications Data//SeleniumWorkSpace//SleniumLearn//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		WebDriver driver = new FirefoxDriver(); (webdriver.gecko.driver) 
		
		
		
		
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equalsIgnoreCase("google")){
			System.out.println("Correct Title");
		}
		else{
			System.out.println("Incorrect Title");
		}
		
		System.out.println(driver.getCurrentUrl());
		
//		System.out.println(driver.getPageSource());
//		driver.switchTo().
//		driver.quit();

	}

}
