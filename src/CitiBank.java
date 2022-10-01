import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CitiBank {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QA full Course Rahul Shetty\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.citi.com/");
        //driver.findElement(By.id("signOnMobileALink")).click();
        driver.findElement(By.id("username")).sendKeys("abc");
        driver.findElement(By.id("password")).sendKeys("efg");
        driver.findElement(By.id("signInBtn")).click();
	}

}
