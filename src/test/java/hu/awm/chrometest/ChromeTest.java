package hu.awm.chrometest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Map;

public class ChromeTest {

	@Test
	public void testName() throws Exception {
		//System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
    Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n",
                              envName,
                              env.get(envName));
        }

    System.out.println("is slave? " + (System.getenv("NODE_NAME") !== null && System.getenv("NODE_NAME").contains("docker"));
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-sandbox");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.google.com/");
		WebElement body = driver.findElement(By.cssSelector("body"));
		System.out.println(body.getText());
		driver.quit();
	}
}
