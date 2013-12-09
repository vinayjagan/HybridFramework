
package com.trip.flights;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTestClass {
	
	public WebDriver driver;
	
	@BeforeClass
	public void browserLaunch(){
		System.out.println("Browser Launching");
		driver = new FirefoxDriver();
		//driver.get("http://demo.actitime.com/login.do");
		driver.get("http://www.makemytrip.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
		
	@AfterClass
	public void browserQuit(){
		System.out.println("Browser Closed");
		driver.quit();
	}

}

