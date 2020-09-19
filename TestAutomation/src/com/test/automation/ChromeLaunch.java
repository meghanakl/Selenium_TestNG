package com.test.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ChromeLaunch {
	static {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MeghanaRao\\Chrome\\chromedriver_win32\\chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String whR = driver.getWindowHandle();
		System.out.println("Reference of current window==>" + whR);
	}
}
