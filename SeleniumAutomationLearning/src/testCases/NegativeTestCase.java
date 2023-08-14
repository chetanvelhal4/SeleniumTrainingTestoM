package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import module.Login;
import pageObjects.LoginPageObjects;

public class NegativeTestCase extends TestCaseBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NegativeTestCase tests = new NegativeTestCase();
		tests.Valid_username_password();

	}

	public void Valid_username_password() {
		setupTest();
		Login.LoginPage(driver, "standard_user", "secret_sauce");
		

		if (driver.getCurrentUrl().contains("inventory")) {
			System.out.println("TC_1 is Passed");

		} else {
			System.out.println("TC_1 is Failed");

		}
		Close_Browser();

	}

}
