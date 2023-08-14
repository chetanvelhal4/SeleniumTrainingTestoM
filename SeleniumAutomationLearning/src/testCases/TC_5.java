package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\incvelh\\git\\SeleniumTrainingTestoM\\SeleniumAutomationLearning\\driver\\chrome\\115\\chromedriver.exe");
		// Open Chrome
		WebDriver driver = new ChromeDriver();
		// Open website
		driver.get("https://www.saucedemo.com/");
		// Enter User Name
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		// Enter [ass
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		if (driver.getCurrentUrl().contains("inventory")) {
			System.out.println("User Logged in ");

		} else {
			System.out.println("User login Failed");

		}
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).clear();
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		driver.findElement(By.id("checkout")).click();
		
		
		

	}
}
