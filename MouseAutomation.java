package SeleniumClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAutomation {
	
	public static WebElement e;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Lucky\\eclipse-workspace\\BatchNo43\\Drivers\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        
		        //step 2: Enter url "http://demo.guru99.com/test/newtours/"
		        driver.get("https://www.fintelconnect.com/about-us/careers/");
		        Thread.sleep(2000);
		        
		       
		        driver.manage().window().maximize();		        
		        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	        
		        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);		       
		        driver.manage().deleteAllCookies();
		        Thread.sleep(3000);
		     
		        // provide provision to mouse on the same browser
		        Actions a = new Actions(driver);
		        e= driver.findElement(By.xpath("//*[text()='Book a Demo']"));
		       
		        a.doubleClick(e).build().perform();
		        Thread.sleep(2000);
		        
		        e= driver.findElement(By.xpath("//*[text()='Book a Demo']"));
		        a.contextClick(e).build().perform();
		        Thread.sleep(2000);
		        
		        e = driver.findElement(By.xpath("(//*[@class='uk-icon'])[1]"));
		        a.moveToElement(e).build().perform();
		        Thread.sleep(2000);
		        
		        e = driver.findElement(By.xpath("(//*[text()='Performance'])[1]"));
		        a.moveToElement(e).click().build().perform();
		        Thread.sleep(2000);
		        
		        for(int i=1; i<=20; i++) {
		        	a.sendKeys(Keys.DOWN).build().perform();
		        	Thread.sleep(500);
		        }
		        Thread.sleep(2000);
		        
		        for(int i=1; i<=5; i++) {
		        	a.sendKeys(Keys.UP).build().perform();
		        	Thread.sleep(500);
		        }
		        
		        
	}

}
