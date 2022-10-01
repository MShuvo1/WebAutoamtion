import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assaignment2dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QA full Course Rahul Shetty\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/angularpractice/");	
		driver.findElement(By.xpath("//div/input[@name='name']")).sendKeys("First Last Name");
		driver.findElement(By.name("email")).sendKeys("Email address");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("strong Password");
		driver.findElement(By.className("form-check-label")).click();
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		driver.findElement(By.cssSelector("input[id='inlineRadio1']")).click();
		driver.findElement(By.name("bday")).sendKeys("01/01/1999");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());

	}

}
