package module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.LoginPageObjects;

public class Login {

	public static void LoginPage(WebDriver driver, String username, String password) {

		driver.findElement(LoginPageObjects.Text_UserName).sendKeys("standard_user");

		driver.findElement(LoginPageObjects.Text_Password).sendKeys("secret_sauce");

		driver.findElement(LoginPageObjects.Login_Btn).click();

	}

}
