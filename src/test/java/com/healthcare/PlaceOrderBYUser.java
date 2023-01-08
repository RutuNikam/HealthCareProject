package com.healthcare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaceOrderBYUser {

	public static WebDriver driver;
	public static WebElement element;
	
		public void Launch_URL() throws InterruptedException
		{
				System.setProperty("webdriver.chrome.driver","./BrowserUtils/chromedriver.exe");
				driver=new ChromeDriver();
				driver.get("http://localhost:8080/medicare/");
				driver.manage().window().maximize();
				Thread.sleep(3000);
		}
		
		//TC_01. Verify User is able to expected URL or not
		public void Verify_LaunchURL()
		{		
				String expectedURL=driver.getCurrentUrl();
				String actualURL="http://localhost:8080/medicare/";
				Assert.assertEquals(expectedURL, actualURL);
				System.out.println("TC_01. Verify User is able to expected URL or not");
				System.out.println("Launched URL Name: " +driver.getCurrentUrl());
				System.out.println("Assert Passed");					
				
		}
		
		//TC_02. Verify User is able to navigate to Login URL or not
		public void Check_Login_Button()
		{
			driver.findElement(By.id("login")).click();
			System.out.println("TC_02.Verify User is able to navigate to Login URL or not");
			System.out.println("Launched URL Name: " +driver.getCurrentUrl());
		}
		
		//TC_03. Verify that user is able to click on login button or 
		public void Validate_User() throws InterruptedException
		{
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("kn@gmail.com");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			System.out.println("TC_03. Verify that user is able to click on login button or ");
			System.out.println("Login Page URL: " +driver.getCurrentUrl());
			
		}
		
		//TC_04. Verify that user is able to login to the Healthcare site or not 
		public void Validate_User1() throws InterruptedException
		{
			element=driver.findElement(By.partialLinkText("Kavita Nigam"));
			System.out.println("TC_04. Verify that user is able to login to the Healthcare site or not ");
			System.out.println("Logged in User name :" +element.getText());
			Thread.sleep(1000);
			
		}
		
		//TC_05 Verify User is able to select Medicine Category or not
		public void select_Medicine_Category() throws InterruptedException
		{
			element=driver.findElement(By.xpath("//a[@href='/medicare/show/category/1/products']"));
			System.out.println("TC_05 Verify User is able to select Medicine Category or not");
			System.out.println("select Medicine Category Name :" +element.getText());
			Thread.sleep(1000);
		}
		
		
		// TC_06 Verify that User is able to add medicine in cart or not		
		public void add_medicine_in_cart() throws InterruptedException
		{
			driver.findElement(By.xpath("//a[@href='/medicare/show/category/1/products']")).click();
			driver.findElement(By.xpath("//a[@href='/medicare/cart/add/1/product']")).click();
			System.out.println("TC_06 Verify that User is able to add medicine in cart or not");
			element=driver.findElement(By.xpath("//h4[@class='nomargin'] "));
			System.out.println("User is able to add medicine in cart " +element.getText());
		}
		
		//TC_07 Verify User is able view cart or not
		public void view_cart() throws InterruptedException
		{
			System.out.println("TC_07 Verify User is able view cart or not");
			element=driver.findElement(By.xpath("//h4[@class='nomargin'] "));
			System.out.println("User is able to view cart and added Medicine Name :" +element.getText());
			Thread.sleep(1000);
		}
		
		//TC_08 Verify User is able to navigate to checkout page or not
		public void navigate_to_checkout_page() throws InterruptedException
		{
			System.out.println("TC_08 Verify User is able to navigate to checkout page or not");
			driver.findElement(By.xpath("//a[@href='/medicare/cart/validate']")).click();
			System.out.println("User is able to navigate to checkout page :" +driver.getCurrentUrl());
			Thread.sleep(1000);
		}
		
		//TC_09 Verify User is able to navigate to add address page or not
		public void navigate_to_add_address() throws InterruptedException
		{
			System.out.println("TC_09 Verify User is able to navigate to add address page or not");
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			System.out.println("User is able to add address");
			Thread.sleep(1000);
		}
		
		//TC_10 Verify User is able to navigate to add Payment details page or not
		public void add_Payment_details() throws InterruptedException
		{
			System.out.println("TC_10 Verify User is able to navigate to add Payment details page or not to add payment");
			driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg btn-block']")).click();
			System.out.println("User is able to add payment");
			Thread.sleep(1000);
		}		
		
		//TC_11 verify User is able to place order after payment or not
		public void able_to_place_order() throws InterruptedException
		{
			System.out.println("TC_11 verify User is able to place order after payment or not");
			driver.findElement(By.xpath("//h3[@class='text-center']"));
			System.out.println("User is able to placed order successfully");
			Thread.sleep(1000);
		}		
		
		//TC_12. Verify User is able to close browser or not
		public void Close_Browser() throws InterruptedException
		{
			System.out.println("TC_12 Verify User is able to close browser or not");
			driver.close();
		}
}
