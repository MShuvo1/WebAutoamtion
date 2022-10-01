import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QA full Course Rahul Shetty\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.com/");
		driver.findElement(By.className("nav-line-1-container")).click();
		driver.findElement(By.id("ap_email")).sendKeys("ariful.islamny105@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Shanthia105");
		driver.findElement(By.id("signInSubmit")).click();
		
		// driver.findElement(By.className("hm-icon-label")).click();
		//driver.findElement(By.xpath("//li/a[@xpath=1]")).click();
		//driver.findElement(By.className("hmenu-item")).click(); 
		//driver.findElement(By.cssSelector("[class='hmenu-item']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13 case");
		driver.findElement(By.id("nav-search-submit-button")).click();
	    driver.findElement(By.className("s-image")).click();
	}

}
