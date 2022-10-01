import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RahulsAcademyLocator2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QA full Course Rahul Shetty\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
        driver.get("https://rahulshettyacademy.com/");
		//input[@name='email']
		driver.findElement(By.xpath("//div/a[@class='theme-btn register-btn']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ariful.islamny105@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Shuvo123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
		driver.findElement(By.xpath("//li/a/span[@class='navbar-current-user']")).click();
		//driver.findElement(By.xpath("//li/a[@href='/current_user/credit_card']")).click();
		driver.findElement(By.xpath("//li/a[@href='/current_user/refer_a_friend']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("h2")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Refer a friend");
		Assert.assertEquals(driver.findElement(By.xpath("//div/h4[@class='_3m0xp']")).getText(),"Give 25%, Get 25%");
		driver.findElement(By.xpath("//a[normalize-space()='Log Out']")).click();
		//driver.close();
		
		
		driver.findElement(By.xpath("//div/a[@href='http://qaclickacademy.usefedora.com/sign_in']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ariful.islamny105@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='bodySmall m-b-3-xs text-center-xs auth-flash-error']")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='bodySmall m-b-3-xs text-center-xs auth-flash-error']")).getText(),"Your email or password is incorrect.");
		System.out.println(driver.findElement(By.xpath("//div/a[@class='bodySmall form-footer']")).getText());
	   
		driver.findElement(By.xpath("//div/a[@class='bodySmall form-footer']")).click();
		System.out.println(driver.findElement(By.xpath("//div/h3[@class='heading4 text-left-xs m-b-1-xs']")).getText());
	}
	
	    public static String getpassword(WebDriver driver) throws InterruptedException
	    {
	    	
		driver.get("https://rahulshettyacademy.com/");
		driver.findElement(By.xpath("//div/a[@class='bodySmall form-footer']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div/h3[@class='heading4 text-left-xs m-b-1-xs']")).click();
		String passwordText= driver.findElement(By.xpath("//div/h3[@class='heading4 text-left-xs m-b-1-xs']")).getText();
		
		// Reset Password
		String [] passwordArray= passwordText.split("'");
		//0th index = Reset
		//1st index = Password 
		String password =passwordArray[1];
		return password;
	
		
		
	//	driver.findElement(By.xpath("//div/a[@href='http://qaclickacademy.usefedora.com/sign_in']")).click();
		//driver.findElement(By.xpath("//div/a[@class='bodySmall form-footer']")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//"))
		
		
		//driver.findElement(By.xpath("//input[@id='email]")).sendKeys("ariful.islamny105@gmail.com");
		
		
		/*driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ariful.islamny105@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Shuvo1");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='bodySmall m-b-3-xs text-center-xs auth-flash-error']")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='bodySmall m-b-3-xs text-center-xs auth-flash-error']")).getText(),"Your email or password is incorrect.");
	
		*/
		
		
		
		
		
		
	}
	
	
}
