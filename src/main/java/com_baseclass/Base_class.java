package com_baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_class {
	public static WebDriver driver;

	public static WebDriver browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void onClick(WebElement element) {
		element.click();
	}

	public static void passValue(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public static void dropDown(WebElement element, String value) {
        Select drop = new Select(element);
        drop.selectByVisibleText(value);
	}
	
	
	
	
		
}
