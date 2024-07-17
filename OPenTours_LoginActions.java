package SeleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OPenTours_LoginActions {

	public static void main(String[] args) throws InterruptedException {
	/*	Steps: scenario...flow
		step 1: Open the browser
		step 2: Enter url "http://demo.guru99.com/test/newtours/"
		step 3. Maximize the window
		Step 4. Enter username on the specific usename text box only
		Step 5. Enter password on the specific pw text box 
		Step 6. click on submit button
		step 7. close the broser */
		
		//step 1: Open the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lucky\\eclipse-workspace\\BatchNo43\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        //step 2: Enter url "http://demo.guru99.com/test/newtours/"
        driver.get("http://demo.guru99.com/test/newtours/");
        
        //step 3. Maximize the window
        driver.manage().window().maximize();
        
        //Step 4. Enter username on the specific usename text box only
        //finding the element and entering the data as mercury in it... 
        driver.findElement(By.name("userName")).sendKeys("mercury",Keys.TAB,"mercury",Keys.TAB, Keys.ENTER);
        Thread.sleep(2000);
        
    /*   // Step 5. Enter password on the specific pw text box 
        driver.findElement(By.name("password")).sendKeys("mercury");
        Thread.sleep(2000);
        
       //Step 6. click on submit button 
        driver.findElement(By.name("submit")).click();        
        Thread.sleep(2000);  */
        
        
        //step 7. close the broser 
    //    driver.close();
	}

}
