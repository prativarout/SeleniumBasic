package SeleniumBasic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("F://My Applications Data//SeleniumWorkSpace//SleniumLearn//src//SeleniumBasic//config.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("name"));
		

		System.getProperty("webdriver.chrome.driver","F://My Applications Data//SeleniumWorkSpace//SleniumLearn//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL = prop.getProperty("url");
		driver.get(URL);

	}

}
