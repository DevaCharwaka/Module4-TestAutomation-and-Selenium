package com.files;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Initializer {
		public static WebDriver driver;
		static String browser;
		public static void setBrowser() {
			Property.readProperties(); // reading the properties from the property file
			browser=Property.prop.getProperty("browser"); // getting the browser value from the property file and storing in browser variable

		}
		public static void setBrowserConfig() {
			if(browser.equals("chrome")) // checking the browser, whether it is chrome or not
			{ 
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\eclipse-workspace\\Module4TestAutomation\\src\\main\\java\\chromedriver.exe");
			}
		}
		public static void runTest() 
		{
			driver=new ChromeDriver();
			driver.get(Property.prop.getProperty("url")); // getting the url from properties file		
		}
		public static void endTest() {
			driver.quit(); // for closing the after all operations
		}
	}


