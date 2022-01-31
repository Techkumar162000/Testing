package com.Ecommerce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class My_Project extends Base_Class{
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",

				"C:\\Users\\91978\\eclipse-workspace\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions b = new Actions(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement signin = driver.findElement(By.className("login"));
		signin.click();

		js.executeScript("window.scrollBy(0,400)");

		WebElement sendemail = driver.findElement(By.id("email_create"));
		sendemail.sendKeys("techkumar11762000@gmail.com");

		WebElement creataccount = driver.findElement(By.xpath("//*[@class='icon-user left']"));
		creataccount.click();
		Thread.sleep(3000);

		WebElement mrclick = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		mrclick.click();

		WebElement name = driver.findElement(By.id("customer_firstname"));
		name.sendKeys("kumar");

		WebElement name2 = driver.findElement(By.name("customer_lastname"));
		name2.sendKeys("R");

		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("9787162788");

		WebElement day = driver.findElement(By.id("days"));
		day.sendKeys("1");

		WebElement month = driver.findElement(By.id("months"));
		month.sendKeys("june");

		WebElement year = driver.findElement(By.id("years"));
		year.sendKeys("2000");

		WebElement company = driver.findElement(By.id("company"));
		company.sendKeys("IBM");

		WebElement address = driver.findElement(By.id("address1"));
		address.sendKeys("3/100,c.mootupatti(vill),pulithikari(post),dharmapuri(post)");

		WebElement pleace = driver.findElement(By.id("city"));
		pleace.sendKeys("chennai");

		WebElement state = driver.findElement(By.name("id_state"));
		state.sendKeys("indiana");

		WebElement pincode = driver.findElement(By.id("postcode"));
		pincode.sendKeys("63520");

		WebElement number = driver.findElement(By.id("other"));
		number.sendKeys("9787162788");

		WebElement phonenumber = driver.findElement(By.id("phone_mobile"));
		phonenumber.sendKeys("9787162788");

		WebElement sign2 = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		sign2.click();
		Thread.sleep(3000);

		driver.navigate().back();

		WebElement emailsend = driver.findElement(By.name("email"));
		emailsend.sendKeys("techkumar11762000@gmail.com");

		WebElement passwordsend = driver.findElement(By.id("passwd"));
		passwordsend.sendKeys("9787162788");

		WebElement sign1 = driver.findElement(By.xpath("//*[@class='icon-lock left']"));
		sign1.click();

		WebElement TS = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(TS).build().perform();
		a.click(TS).build().perform();

		js.executeScript("window.scrollBy(0,400)");
		WebElement sl = driver.findElement(By.id("selectProductSort"));
		Select aa = new Select(sl);
		aa.selectByIndex(3);

		WebElement photoclick = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
		a.moveToElement(photoclick).build().perform();
		a.click(photoclick).build().perform();

		js.executeScript("window.scrollBy(0,400)");
		WebElement amount = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		a.moveToElement(amount).build().perform();
		a.click(amount).build().perform();

		WebElement addtocardclick = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		b.moveToElement(addtocardclick).build().perform();
		b.click(addtocardclick).build().perform();

		WebElement proccedtocheckout = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[2]"));
		proccedtocheckout.click();

		WebElement summeryclick = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		summeryclick.click();

		WebElement addressclick = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[7]"));
		addressclick.click();

		WebElement agreeclick = driver.findElement(By.xpath("//input[@type='checkbox']"));
		agreeclick.click();

		WebElement proccedcheckoutclick = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		proccedcheckoutclick.click();

		WebElement paybybankwireclick = driver.findElement(By.xpath("//a[@class='bankwire']"));
		paybybankwireclick.click();

		 driver.close();

	}
}


