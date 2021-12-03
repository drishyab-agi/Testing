package MavenProject1.MavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Example4 {
	public static void main(String[] args)throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Drishya\\Selenium\\chromedriver.exe");  
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://staloysius.edu.in/");  
   	  
	    driver.manage().window().maximize();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	       
		js.executeScript("window.scrollBy(0,2000)");
		
	    driver.switchTo().frame("ipxcelframe"); 
	    
	    System.out.println("********We are switched to the iframe*******");
	    
	    Thread.sleep(1000);
	    
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/a[2]")).click();		
	
	    driver.switchTo().defaultContent();

	    System.out.println("*********We are done***************");
	    
	    //driver.close();
	}

}
