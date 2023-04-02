package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yuvar\\eclipse-workspace\\Codoid\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("karthik");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

	}

}
