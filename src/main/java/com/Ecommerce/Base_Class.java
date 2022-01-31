package com.Ecommerce;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;

	// 1.broswer lanuch

	public static WebDriver broswerLanuch(String broswer) {
		if (broswer.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\96Version\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;

	}

	// 2. click
	public static void clickmethod(WebElement element) {
		element.click();

	}

	// 3. sendkeys
	public static void sendvalues(WebElement element, String value) {
		element.sendKeys(value);

	}

	// 4. GetURL
	public static void geturl(String url) {
		driver.get(url);

	}

	// 5. close
	public static void driverclose() {
		driver.close();

	}

	// 6. Quit
	public static void driverquit() {
		driver.quit();

	}

	// 7.Navigate to
	public static void navigateto(String url) {
		driver.navigate().to(url);
	}

	// 8. Navigate back
	public static void navigateback() {
		driver.navigate().back();

	}

	// 9. Navigate forward
	public static void navigateforward() {

		driver.navigate().forward();
	}
	// 10. navigate refresh

	public static void navigaterefresh() {
		driver.navigate().refresh();
	}

	// 11.current url
	public static void getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl:" + currentUrl);

	}

	// 12.Gettitle
	public static void gettitle() {
		String title = driver.getTitle();
		System.out.println("title:" + title);

	}

	// 13.Alertaccept
	public static void alertaccept() {
		driver.switchTo().alert().accept();

	}

	// Alertdismiss
	public static void alertdismiss() {
		driver.switchTo().alert().dismiss();

	}

	// 14.javascript
	public static void javascript() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
	}

	// 15.Keyboard action=Robot
	public static void Robot() throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	// 16.Takescreenshot
	public static void Takescreenshot() throws Throwable {
		TakesScreenshot src = (TakesScreenshot) driver;
		File sr = src.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Selenium_Tool\\Screens\\snap1s.png");
		FileUtils.copyFile(sr, dest);
	}

	// 17.getoptions
	public static void getoptions() {
		Select aa = new Select(null);
		List<WebElement> options = aa.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}

	}

	// 18.getallselectedoptions
	public static void getallselectedoptions() {
		Select aa = new Select(null);
		List<WebElement> f2 = aa.getAllSelectedOptions();
		for (WebElement webElement : f2) {
			System.out.println(webElement.getText());
		}
	}

	// 19.firstselectoptions
	public static void firstselectoptions() {
		Select aa = new Select(null);
		WebElement f1 = aa.getFirstSelectedOption();
		System.out.println(f1.getText());
	}
	//20.Wait
	public static void implicitywait(int seconds, TimeUnit format) {
		driver.manage().timeouts().implicitlyWait(seconds,format);
	}
	
	public static void explicitywait(int seconds,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(element));

	}
    //21.MouseActions
	public static void actions(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement((WebElement) a).build().perform();
		a.click().build().perform();

	}
	//22.dropdown
	public static void drop_down( String type, WebElement element,String data) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("byIndex")) {
			int value= Integer.parseInt(data);
			s.selectByIndex(value);
			
		}
		else if (type.equalsIgnoreCase("byValue")) {
			s.selectByValue(data);
			
		}
		else if (type.equalsIgnoreCase("byVisibleText")) {
			s.selectByVisibleText(data);
		}
		
	}
}
