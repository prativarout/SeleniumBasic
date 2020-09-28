package SeleniumBasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("webdriver.chrome.driver","F://My Applications Data//SeleniumWorkSpace//SleniumLearn//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
//		Click Button to see alert
/*		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		System.out.println(alert.getClass());
		alert.accept();
		alert.dismiss();
*/
		
//		On button click, alert will appear after 5 seconds
		
/*		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Thread.sleep(6000);
		Alert alert1 = driver.switchTo().alert();
		
		System.out.println(alert1.getText());
		System.out.println(alert1.getClass());
		alert1.accept();
*/
		
		
		
//		On button click, confirm box will appear
		
	/*	driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		
		Alert alert2 = driver.switchTo().alert();
		
		System.out.println(alert2.getText());
		System.out.println(alert2.getClass());
		alert2.dismiss();
	*/	
//		On button click, prompt box will appear
		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		
		Alert alert2 = driver.switchTo().alert();
		
		System.out.println(alert2.getText());
		System.out.println(alert2.getClass());
		alert2.sendKeys("Prativa");
		alert2.accept();
	}

}
