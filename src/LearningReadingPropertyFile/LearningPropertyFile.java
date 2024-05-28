package LearningReadingPropertyFile;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearningPropertyFile {
	
	public static void main(String Args[]) throws IOException
	{

		// TODO Auto-generated method stub
		FileInputStream stream = new FileInputStream("config.properties");
		Properties properties = new Properties();
		properties.load(stream);
		
		String browser = properties.getProperty("browser");
		String DriverLocation = properties.getProperty("DriverLocation");
		
    if(browser.equalsIgnoreCase("chrome"))
	{
		System.getProperty("webdriver.chrome.driver", DriverLocation);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}	
    else if(browser.equalsIgnoreCase("Firefox"))
    {
     	System.getProperty("webdriver.gecko.driver", DriverLocation);
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
	}
}
}

