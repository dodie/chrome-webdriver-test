package hu.awm.chrometest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

	@Test
	public void testName() throws Exception {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-sandbox");
		WebDriver browser = new ChromeDriver(options);
		driver.get("http://www.google.com/");
		WebElement body = driver.findElement(By.cssSelector("body"));
		System.out.println(body.getText());
		driver.quit();
	}
}
