package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		System.getProperty("webdriver.chrome.driver","F://My Applications Data//SeleniumWorkSpace//SleniumLearn//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/droppable");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		WebElement source = driver.findElement(By.xpath("//*[@id='draggable']"));
//		WebElement destination = driver.findElement(By.xpath("//*[@id='droppable']"));
		
		Actions action = new Actions(driver);
		
//		action.dragAndDrop(source, destination).build().perform();
		
//		action.dragAndDrop(driver.findElement(By.xpath("//*[@id='draggable']")), driver.findElement(By.xpath("//*[@id='droppable']"))).build().perform();
		
//		action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']"))).moveToElement(driver.findElement(By.xpath("//*[@id='droppable']"))).release().build().perform();
		
	action.doubleClick(driver.findElement(By.xpath("//*[@id='droppableExample-tab-preventPropogation']"))).build().perform();	

	}

}
