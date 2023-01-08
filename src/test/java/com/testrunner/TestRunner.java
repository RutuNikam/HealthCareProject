package com.testrunner;

import org.testng.annotations.Test;


import com.healthcare.PlaceOrderBYUser;
import com.healthcare.SignUpNewSupplier;
import com.healthcare.SignUpNewUser;

public class TestRunner {

	@Test
	public void PlaceOrderByUser() throws InterruptedException
	{
		PlaceOrderBYUser obj1=new PlaceOrderBYUser();
		obj1.Launch_URL();
		obj1.Verify_LaunchURL();//TC_01
		obj1.Check_Login_Button();//TC_02
		obj1.Validate_User();//TC_03
		obj1.Validate_User1();//TC_04
		obj1.select_Medicine_Category();//TC_05
		obj1.add_medicine_in_cart();//TC_06
		obj1.view_cart();//TC_07
		obj1.navigate_to_checkout_page();//TC_08
		obj1.navigate_to_add_address();//TC_09
		obj1.add_Payment_details();//TC_10
		obj1.able_to_place_order();	//TC_11	
		
		System.out.println("Testing Scenario Third");
		obj1.Close_Browser();
	}
	
	@Test
	public void SignUpNewUsermethod() throws InterruptedException
	{
		SignUpNewUser sign=new SignUpNewUser();
		sign.Launch_URL();
		sign.SignUp();
		sign.SignUp_Confirmation_Page();
		sign.Close_Browser();
	}
	
	@Test
	public void SignUpNewSupplierMethod() throws InterruptedException
	{
		SignUpNewSupplier sign=new SignUpNewSupplier();
		sign.Launch_URL();
		sign.SignUp();
		sign.SignUp_Confirmation_Page();
		sign.Close_Browser();
	}
	
}
