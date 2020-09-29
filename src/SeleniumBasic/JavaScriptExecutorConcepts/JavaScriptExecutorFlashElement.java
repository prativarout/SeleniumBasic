package SeleniumBasic.JavaScriptExecutorConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorFlashElement {

	public static void main(String[] args) {
		
			System.getProperty("webdriver.chrome.driver","F://My Applications Data//SeleniumWorkSpace//SleniumLearn//chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
			

				
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
				System.out.println("Before" + driver.getTitle());
				WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
//				WebElement LoginBtn = driver.findElement(By.xpath("//button[@type='submit']")).click();
				flash(loginbtn,driver);
	}
	
	public static void flash(WebElement element,WebDriver driver){
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for(int i = 0;i<=100;i++){
			changeColor("rgb(221, 81, 76)",element,driver);
			changeColor("bgcolor",element,driver);
		}
		
	}

	private static void changeColor(String color, WebElement element,
			WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor= '"+color+"'", element);
		
	}

}
