package SeleniumBasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		
		System.getProperty("webdriver.chrome.driver","F://My Applications Data//SeleniumWorkSpace//SleniumLearn//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.goindigo.in/");
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		List<WebElement> list = driver.findElements(By.tagName("input"));
		
		System.out.println(list.size());
		
		for(int i=0; i<list.size() ; i++){
			
			String txt = list.get(i).getText();
			
			System.out.println(txt);
			
			driver.findElement(By.xpath("//label[@for='armedForces']")).click();
			
			driver.close();
		}
		
		

	}

}
