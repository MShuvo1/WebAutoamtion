import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmiratesDropdownE2Etesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QA full Course Rahul Shetty\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.emirates.com/us/english/");	
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		driver.findElement(By.xpath("//div/label[@class='field__text']")).click();
		driver.findElement(By.xpath("//input[@name='Arrival Airport']")).sendKeys("Dhaka airport");
		driver.findElement(By.xpath("//li/div[@class='dropdown__link js-select-body js-location-link']")).click();
		driver.findElement(By.xpath("//div/label[@class='checkbox one-way']")).click();
		
		// optional for other website, it does not apply for Emirates 
		System.out.println(driver.findElement(By.xpath("//span[@class='label-text--action label-text--return']")).isEnabled());
		driver.findElement(By.xpath("//tbody/tr/td/a[@aria-label='18  Jun 22']")).click();
		
		
		// optional for other website, it does not apply for Emirates
		System.out.println(driver.findElement(By.xpath("//span[@class='label-text--action label-text--return']")).isEnabled());
		//driver.findElement(By.xpath("//span[@class='label-text--action label-text--return']")).click();
	    //driver.findElement(By.xpath("//button[@class='cta cta--large cta--primary js-widget-submit ']")).click();
	
	    driver.findElement(By.id("tcm:154-73543")).click();
	       
	    Thread.sleep(2000);
	    //driver.findElement(By.xpath("(//section/div/button[@class='js-increment-increase increment-field__button increment-field__increase'])[1]")).click();
	    //driver.findElement(By.xpath("(//section/div/button[@class='js-increment-increase increment-field__button increment-field__increase'])[1]")).click();
	    // shoul print howmany passenger, didn't work beacuse of website issue
	    System.out.println(driver.findElement(By.id("tcm:154-73543")).getText());
	    
	    /*int i=1;  
	    while(1<5) {
	    	
	    	driver.findElement(By.xpath("(//section/div/button[@class='js-increment-increase increment-field__button increment-field__increase'])[1]")).click();
	    	i++;
	     }
	    */
	    

	for(int i=1; i<5; i++) {
	   driver.findElement(By.xpath("(//section/div/button[@class='js-increment-increase increment-field__button increment-field__increase'])[1]")).click();
	    	
	    	
	    }
	    	// should print howmany passenger, didn't work beacuse of website issue
	System.out.println(driver.findElement(By.id("tcm:154-73543")).getText());
	driver.findElement(By.xpath("//div/form/button[@class='cta cta--large cta--primary js-widget-submit ']")).click();	
	
	}

}
