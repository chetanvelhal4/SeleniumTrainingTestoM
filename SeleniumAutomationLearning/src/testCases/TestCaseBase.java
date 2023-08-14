package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseBase {

	public void Close_Browser()
	{
		driver.close();
	}
	
	 WebDriver driver = null;
	public void setupTest()
	{
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\incvelh\\git\\SeleniumTrainingTestoM\\SeleniumAutomationLearning\\driver\\chrome\\115\\chromedriver.exe");
		
		 driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}

}
