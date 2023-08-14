package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("WebDriver.chrome.driver","C:\\\\Users\\\\incvelh\\\\git\\\\SeleniumTrainingTestoM\\\\SeleniumAutomationLearning\\\\driver\\\\chrome\\\\115\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
		driver.findElement(By.id("user-name")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
    //  System.out.println(driver.findElement(By.xpath("//div[@class='error-message-container error']//[text()='Epic sadface: Sorry, this user has been locked out.']/")));   
		
		
		
		
		
		
		
	}

}
