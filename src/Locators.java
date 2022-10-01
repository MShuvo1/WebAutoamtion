import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QA full Course Rahul Shetty\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// driver.get("https://rahulshettyacademy.com/");
		// ((WebElement) driver.findElements(By.id("form-input"))).sendKeys("abc");
		// driver.findElement(By.name("password")).sendKeys("abc");
		// driver.findElement(By.className("td-button-primary")).click();
		// driver.findElement(By.className("td-button-primary")).click();

		driver.get("https://onlinebanking.tdbank.com/#/authentication/login");
		driver.findElement(By.id("formElement_0")).sendKeys("arifulislam123");
		driver.findElement(By.name("password")).sendKeys("abc");
		driver.findElement(By.className("td-button-primary")).click();
		// driver.findElement(By.className("td-button-primary")).click();

	}

}
