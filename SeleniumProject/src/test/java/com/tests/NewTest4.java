package com.tests;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewTest4 {
	
	
  @Test
  public void testclearTrip() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.cleartrip.com/");
	   
	  WebElement from=driver.findElement(By.id("FromTag"));
	  
	  
	  Actions act1=new Actions(driver);
	  act1.keyDown(from, Keys.SHIFT).perform();
	  Thread.sleep(2000);
	  act1.sendKeys("hyd").perform();
	  Thread.sleep(2000);
	  act1.sendKeys(Keys.ENTER).perform();
	  
	  WebElement to=driver.findElement(By.id("ToTag"));
	  to.sendKeys("bang");
	  
	  WebElement ul=driver.findElement(By.id("ui-id-2"));
	  List<WebElement> list=ul.findElement(By.tagName("li"));
	  
	  for(WebElement e:list)
	  {
		  String city=e.getText();
		  if(city.contains("BKK"))
		  {
			  e.click();
			  break;
		  }
	  }
	  
	
	
	  
  }
  
