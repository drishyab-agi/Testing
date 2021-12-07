package MavenProject1.MavenProject;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class ActionsExample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Drishya\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		WebElement txtUsername = driver.findElement(By.id("email"));

		Actions builder = new Actions(driver);
		Action seriesOfActions = builder
			.moveToElement(txtUsername) 
			.click() 
			.keyDown(txtUsername, Keys.SHIFT) 
			.sendKeys(txtUsername, "hello") 
			.keyUp(txtUsername, Keys.SHIFT) 
			.doubleClick(txtUsername) 
			.contextClick() 
			.build(); 
			
			seriesOfActions.perform() ;
			
		driver.close();

	}
}
