package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfWebElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yuvar\\eclipse-workspace\\Codoid\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com");
		Thread.sleep(2000);
		
		List<WebElement> findElements = driver.findElements(By.xpath("//select[@id='multiselect1']/option"));
		for(int i =0; i<findElements.size();i++) {
			System.out.println(findElements.get(i).getText());
		}
	}

}
