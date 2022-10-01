import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QA full Course Rahul Shetty\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		//driver.findElement(By.id("divpaxinfo")).click();
		
		//driver.get("https://www.spicejet.com/");

		//driver.findElement(By.xpath("//div[@style='font-family: inherit;']")).click();
		//driver.findElement(By.xpath("(//div[@data-testid='search-renderPax'])[1]")).click();
		//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
		//driver.findElement(By.id("hrefIncAdt")).click();
		
		 driver.get("https://www.emirates.com/us/english/");
		 Thread.sleep(2000L);
		 driver.findElement(By.xpath("(//input[@name='Departure Airport'])[1]")).click();
		//Thread.sleep(2000L);
		
		
		
		
		
	}

}
