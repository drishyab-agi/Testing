package MavenProject1.MavenProject;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class WindowHandlingExample {
	public static void main(String[] args)throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Drishya\\Selenium\\chromedriver.exe");  
        WebDriver driver = new ChromeDriver();
      
      		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
      		
      		//Click on blinking text link
      		driver.findElement(By.cssSelector(".blinkingText")).click();
      		
      		//Get all windows
      		Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]
      		
      		//Get parent and child window id
      		Iterator<String>it = windows.iterator();
      		String parentId = it.next();
      		String childId = it.next();
      		
      		//switch to child window
      		driver.switchTo().window(childId);
      		
      		//Get Text
      		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());		
      		
      		//Swich to parent window
      		driver.switchTo().window(parentId);
      		
      		//Send emailid in username textbox 
      		driver.findElement(By.id("username")).sendKeys("drishya@gmail.com");
      		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("drishya123");
      	
      		WebElement staticDropDown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[5]/select"));
    		Select dropdown = new Select(staticDropDown);  
    		dropdown.selectByIndex(1); 	
    		
    		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
    		
    		driver.findElement(By.xpath("//*[@id=\"signInBtn\"]")).click();
    		
    		
      		driver.close();
      	    driver.quit();
	}
}
