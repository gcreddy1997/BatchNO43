package SeleniumClasses;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class JavascriptExecutorClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lucky\\eclipse-workspace\\BatchNo43\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        //step 2: Enter url "http://demo.guru99.com/test/newtours/"
        driver.get("https://www.makemytrip.com/");
        Thread.sleep(2000);
        
        driver.manage().window().maximize();		        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	        
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);		       
        driver.manage().deleteAllCookies();
      
        
        //Way 2:
        // able to find the element by SWD
        
        WebElement e = driver.findElement(By.xpath("//*[@class='font14 fullWidth']"));
     // wants to click using JS
        JavascriptExecutor js =(JavascriptExecutor)driver;
         //       SWD        JS                       SWD
        js.executeScript(" arguments[0].setAttribute('style','background:yellow; border:2px double red'); ", e);
        js.executeScript("   arguments[0].value='9871536682';    " , e);
        Thread.sleep(2000);
        Thread.sleep(2000);
        
        //way1:
       // locate and act using JS only
    //   js.executeScript("   document.getElementByClassName('lazy').click();      ") ;
        WebElement e1 = driver.findElement(By.xpath("//*[@class='commonModal__close']"));
        js.executeScript(" arguments[0].setAttribute('style','background:blue; border:2px solid red'); ", e1);
        js.executeScript(" arguments[0].click();   ", e1);
        Thread.sleep(2000);
        
        List<WebElement> l = driver.findElements(By.xpath("//*[@class='customRadioBtn sizeSm primary ']"));
        WebElement e3 = l.get(1);
        //Highlight this element
        js.executeScript(" arguments[0].setAttribute('style','background:yellow; border:2px grove red'); ", e3);
        js.executeScript(" arguments[0].click(); ", e3);
        Thread.sleep(2000);
        
       // element should clicked.... drop will open
        // js.executeScript(" arguments[0].selectedIndex='2'; ", e);
        
        
        // create my own alert
        js.executeScript("  alert('batch no 43 studetns are well responsive.... ');  ");
        Thread.sleep(5000);
        driver.switchTo().alert().dismiss();
        
        //element should be on the view..
        WebElement e4 = driver.findElement(By.xpath("//*[text()='GET APP LINK']"));
        js.executeScript("  arguments[0].scrollIntoView();   ", e4);
        Thread.sleep(2000);
        
        js.executeScript("  window.scrollTo(0, document.body.scrollHeight)  ");
        Thread.sleep(2000);
        
        js.executeScript("  window.scrollTo(document.body.scrollHeight, 0)  ");
        Thread.sleep(2000);
        
        // partial down vertically  down
        js.executeScript("  window.scrollBy(0, 500); ");
        Thread.sleep(2000);
        
        // partial down vertically  up
        js.executeScript("  window.scrollBy(0, -400); ");
        Thread.sleep(2000);
       
        
      /*  //enable or disale the elements
        js.executeScript(" arguments[0].setAttribute='disabled'; ",e4);
        Thread.sleep(2000);
        js.executeScript(" arguments[0].removeAttribute='disabled'; ",e4);
        Thread.sleep(2000); */
        
        
        // taking screenshot of the page
        File f1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  // print screen
        File f2 = new File("C:\\Users\\Lucky\\Desktop\\screenshot.png");
        FileHandler.copy(f1, f2);       
        
	}

}
