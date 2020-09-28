package SeleniumBasic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserPopup {

	public static void main(String[] args) {
		
		System.getProperty("webdriver.chrome.driver","F://My Applications Data//SeleniumWorkSpace//SleniumLearn//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://popuptest.com/");
		
		driver.findElement(By.linkText("Multi-PopUp Test #2")).click();
		
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		
		Set<String> handle = driver.getWindowHandles();
		 
		Iterator<String> it = handle.iterator();

			while(it.hasNext()){
				
				String childwindow = it.next();
				
				if(!parentwindow.equals(childwindow)){
					
					driver.switchTo().window(childwindow);
				
					
					System.out.println(driver.switchTo().window(childwindow).getTitle());
					driver.close();
				}
			}
//		String pw = it.next();
//		
//		System.out.println("Parent Window id" + pw);
//		
//		String cw1 = it.next();
//		
//		driver.switchTo().window("cw1");
//		
//		System.out.println("Child1 Window id" + cw1);
//		
//		driver.close();
//		
//		String cw2 = it.next();
//		driver.switchTo().window(cw2);
//		
//		System.out.println("Child2 Window id" + cw2);
//		
//		driver.close();
//		
//		driver.switchTo().window(pw);
//		
//		System.out.println(driver.getTitle());
//		

	}

}
