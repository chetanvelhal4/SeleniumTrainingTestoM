package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC_3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\incvelh\\git\\SeleniumTrainingTestoM\\SeleniumAutomationLearning\\driver\\chrome\\115\\chromedriver.exe");
		// Open Chrome
		WebDriver driver = new ChromeDriver();
		// Open website
		driver.get("https://www.saucedemo.com/");
		// Enter User Name
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		// Enter [ass
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(5000);
		
		
		if (driver.getCurrentUrl().contains("inventory")) {
			System.out.println("TC_3 is Passed");

		} else {
			System.out.println("TC_3 is Failed");

		}
		driver.quit();

	}

}
