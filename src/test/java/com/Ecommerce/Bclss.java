package com.Ecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bclss  {
	public static WebDriver driver;

	// Click
	public static void click(WebElement e) {
		e.click();

	}

	// Sendkeys
	public static void sendvalue(WebElement a, String value) {
		a.sendKeys(value);

	}

	// URL
	public static void geturl(String m) {
		driver.get(m);

	}

	// Broswer Lanch
	
	public static WebDriver browserLaunch(String brower) {
		if (brower.equalsIgnoreCase("Chrome")) {
			System.setProperty("WebDriver.Chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		}
		return driver;

	}

}



