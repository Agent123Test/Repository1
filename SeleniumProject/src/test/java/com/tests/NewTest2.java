package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest2 {
	
	
  @Test
  public void testMercuryToursLogin() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\a07208trng_b4b.04.24\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://newtours.demoaut.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.name("userName")).sendKeys("mercury");
	  driver.findElement(By.name("password")).sendKeys("mercury");
	  driver.findElement(By.name("login")).click();
	  String title=driver.getTitle();
	  
	  Assert.assertEquals(title,"Find a Flight: Mercury Tours:"); //Verification once after the above actions has been performed.Assert will verify the object which has to given and confirm the actions are as expected by giving the result.
	  
	  
  }
 
  
  
}
