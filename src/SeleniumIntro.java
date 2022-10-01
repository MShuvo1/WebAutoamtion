import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		
		
		// invite/call browser
		// Chrome- ChromeDriver- Methods
		// Safari- SafariDriver- Methods
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QA full Course Rahul Shetty\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
        driver.get("https://www.santanderbank.com/");
		
		
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\QA full Course Rahul Shetty\\edgedrivermsedgedriver.exe");
	    //WebDriver driver= new EdgeDriver();
        //driver.get("https://www.santanderbank.com/");
        
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
        // when you have multiple window open and want to close them use "quit" instead of "close"
        
       // driver.quit();
	}

}
