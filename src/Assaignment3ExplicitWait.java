import java.awt.List;
import java.awt.Point;
import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assaignment3ExplicitWait {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Interview\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String[] itemsNeeded = { "iphone x", "Samsung Note 8" };
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		addItems(driver, itemsNeeded);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");
		driver.findElement(By.xpath("//label[2]//span[2]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okayBtn']")));
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		Select dropDown = new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
		dropDown.selectByVisibleText("Consultant");
		driver.findElement(By.xpath("//select[@class='form-control']")).click();
		driver.findElement(By.cssSelector("#terms")).click();
		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[contains(text(),'Add')])")));

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		// TODO Auto-generated method stub
		int j = 0;
	
		List<WebElement> products = driver.findElements(By.xpath("(//button[contains(text(),'Add')])"));

		for (int i = 0; i < products.size; i++) {

		Point name = products.get(i);
			List itemsNeededList = (List) Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(name))

			{

				j++;

				// click on Add to cart

				driver.findElements(By.xpath("(//button[contains(text(),'Add')])")).get(i).click();

				if (j == itemsNeeded.length)

				{

					break;

				}

			}
		}
	}
}