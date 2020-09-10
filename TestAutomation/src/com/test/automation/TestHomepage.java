package com.test.automation;


    import org.openqa.selenium.*;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;
	import org.testng.annotations.*;
	   public class TestHomepage {

	    public String baseUrl = "https://www.salesforce.com/in";
	    String driverPath = "C:\\chromedriver.exe";
	    public WebDriver driver ; 
	     
	     @BeforeTest
	      public void launchBrowser() {
	          System.out.println("launching Chrome browser"); 
	          System.setProperty("webdriver.Chrome.driver", driverPath);
	          driver = new FirefoxDriver();
	          driver.get(baseUrl);
	      }
	      @Test
	      public void verifyHomepageTitle() {
	          String expectedTitle = "CRM Software: Cloud Computing Solutions For Every Business - Salesforce IN";
	          String actualTitle = driver.getTitle();
	          Assert.assertEquals(actualTitle, expectedTitle);
	     }
	      @AfterTest
	      public void terminateBrowser(){
	          driver.close();
	      }
	}
