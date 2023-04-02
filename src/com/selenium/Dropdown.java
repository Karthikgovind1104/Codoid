package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yuvar\\eclipse-workspace\\Codoid\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");

		WebElement fruits = driver.findElement(By.id("fruits"));  
	    Select ref1 = new Select(fruits);
	    ref1.selectByIndex(1);
	    
	    WebElement superhero = driver.findElement(By.id("superheros"));
	    Select ref2 = new Select(superhero);
	    ref2.selectByValue("ta");
	    ref2.selectByVisibleText("Batwoman");
	  	   
	    Thread.sleep(3000);
	    ref2.deselectByValue("ta");
	    Thread.sleep(3000);
	    
	    WebElement languages = driver.findElement(By.id("lang"));
	    Select ref3 = new Select(languages);
	    ref3.selectByVisibleText("Java");
	    
	    driver.quit();
	}
}
