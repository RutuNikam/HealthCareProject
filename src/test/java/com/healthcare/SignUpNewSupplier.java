package com.healthcare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpNewSupplier {
	public static WebDriver driver;
	public static WebElement element;

	public void Launch_URL() throws InterruptedException
	{
			System.setProperty("webdriver.chrome.driver","./BrowserUtils/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://localhost:8080/medicare/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
	}
	
	//TC_01 Verify SignUp functionality is working or not
	public void SignUp() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@href='/medicare/membership']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("firstName")).sendKeys("Rutu");
		
		driver.findElement(By.id("lastName")).sendKeys("Nik");
		driver.findElement(By.id("email")).sendKeys("RSNN2@gmail.com");
		driver.findElement(By.id("contactNumber")).sendKeys("9874563210");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.id("confirmPassword")).sendKeys("12345");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='role2']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);		
		
	}
	
	public void SignUp_Confirmation_Page() throws InterruptedException
	{
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='addressLineOne']")).sendKeys("abc lane");		
		driver.findElement(By.xpath("//input[@id='addressLineTwo']")).sendKeys("xyz lane");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("pune");
		driver.findElement(By.xpath("//input[@id='postalCode']")).sendKeys("123654");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("mh");
		driver.findElement(By.xpath("//input[@id='country']")).sendKeys("India");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@name='_eventId_confirm']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary']")).click();
		System.out.println("Supplier SignUp Process completed successfully");
				
	}
	public void Close_Browser() throws InterruptedException
	{
		System.out.println("TC_12 Verify User is able to close browser or not");
		driver.close();
	}

}
