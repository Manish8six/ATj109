package package1;

import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase01 {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}

	@AfterMethod
	public void tearDowm() {
		driver.close();

	}

	@Test
	public void verifyTitle() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@Test
	public void verifyLogo() {
		boolean Flag = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed();

		Assert.assertTrue(Flag);

	}
}
