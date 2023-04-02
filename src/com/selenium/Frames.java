package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yuvar\\eclipse-workspace\\Codoid\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");

		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("karthik");
	}
}
