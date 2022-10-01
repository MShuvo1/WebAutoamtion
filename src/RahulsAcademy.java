import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulsAcademy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QA full Course Rahul Shetty\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/");
		//input[@name='email']
		driver.findElement(By.xpath("//div/a[@class='theme-btn register-btn']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ariful.islamny105@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Shuvo123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//li/a/span[@class='navbar-current-user']")).click();
		driver.findElement(By.xpath("//li/a[@href='/current_user/credit_card']")).click();
	}

}
