package com.test.automation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestHomepage {

	public String baseUrl = "https://www.salesforce.com/in";
	public String driverPath = "C://DRIVER//chromedriver.exe";
	public WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		System.out.println("Executing before test");
		System.setProperty("webdriver.chrome.driver", driverPath); // small c
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}

	@BeforeMethod
	public void BeforeEveryTestCase() {
		System.out.println("Executing before method");
		driver.get(baseUrl);

	     }

	// String s = "https://www.salesforce.com/in";

	@Test
	public void TestVerifyHomepageTitle() {
		driver.get(baseUrl);
		String expectedTitle = "CRM Software: Cloud Computing Solutions For Every Business - Salesforce IN";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@Test
	public void TestVerifyLoginLink() {

		driver.findElement(By.linkText("Login")).sendKeys(Keys.ENTER);
		String expectedTitle = "Login | Salesforce";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@Test
	public void TestLoginWithBlankCredential() {
		driver.get("https://login.salesforce.com/?locale=in");
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("");
		WebElement pwd = driver.findElement(By.name("pw"));
		pwd.sendKeys("");
		WebElement signin = driver.findElement(By.name("Login"));
		signin.click();
		String expectedTitle = "Login | Salesforce";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@Test
	public void TestLoginWithWrongCredential() {
		driver.get("https://login.salesforce.com/?locale=in");
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("Megha");
		WebElement pwd = driver.findElement(By.name("pw"));
		pwd.sendKeys("Megha");
		WebElement signin = driver.findElement(By.name("Login"));
		signin.click();
		String expectedTitle = "Login | Salesforce";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@Test
	public void TestLoginWithBlankPwd() {
		driver.get("https://login.salesforce.com/?locale=in");
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("Megha");
		WebElement pwd = driver.findElement(By.name("pw"));
		pwd.sendKeys("");
		WebElement signin = driver.findElement(By.name("Login"));
		signin.click();
		String expectedTitle = "Login | Salesforce";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@Test
	public void TestLoginWithBlankUserName() {
		driver.get("https://login.salesforce.com/?locale=in");
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("");
		WebElement pwd = driver.findElement(By.name("pw"));
		pwd.sendKeys("Megha");
		WebElement signin = driver.findElement(By.name("Login"));
		signin.click();
		String expectedTitle = "Login | Salesforce";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@AfterTest
	public void terminateBrowser() {
		driver.close();

	}

}
