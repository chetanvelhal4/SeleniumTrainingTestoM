package testCases;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import module.Login;
import pageObjects.LoginPageObjects;

public class NegativeTestCase extends TestCaseBase {

	@Before
	public void SetupTest() {
		setupTest();
	}
    @After
	public void EndBrowser() {
		Close_Browser();
	}

	@Test
	public void Valid_username_password() {

		Login.LoginPage(driver, "standard_user", "secret_sauce");

		if (driver.getCurrentUrl().contains("inventory")) {
			System.out.println("TC_1 is Passed");

		} else {
			System.out.println("TC_1 is Failed");

		}

	}

	@Test
	public void no_username_password() {

		// Login.LoginPage(driver, "", "");
		driver.findElement(LoginPageObjects.Login_Btn).click();
		

		String Expected_ErrorMsg = "Epic sadface: Username is required";
		
		String Actual_ErrorMsg = driver.findElement(By.xpath("//h3[@data-test]")).getText();
		
		Assert.assertEquals("no_username_password Failed",Actual_ErrorMsg);
		System.out.println(Actual_ErrorMsg);
		

	}

	@Test
	public void no_password()

	{

		Login.LoginPage(driver, "standard_user", "");
		String Expected_ErrorMsg = "Epic sadface: Username and password do not match any user in this service";
		String Actual_ErrorMsg = driver.findElement(By.xpath("//h3[@data-test]")).getText();
		System.out.println(Actual_ErrorMsg);
		if (Actual_ErrorMsg.equals(Expected_ErrorMsg)) {
			System.out.println("Test Case 3 Passed");
		} else {
			System.out.println("Test case 3 Failed");
		}

	}

}
