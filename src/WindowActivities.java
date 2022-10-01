import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QA full Course Rahul Shetty\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://google.com");
        Thread.sleep(2000);
        driver.navigate().to("https://www.w3schools.com/");
        driver.navigate().back();
        driver.navigate().forward();
        
        
        
        	}
	

}
