package MavenProject1.MavenProject;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class CheckBox {
	public static void main(String[] args) throws InterruptedException {  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Drishya\\Selenium\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://demo.guru99.com/test/radio.html"); 
		Thread.sleep(3000);
		
		List<WebElement> checkbox=driver.findElements(By.xpath("//*[@type='checkbox' and @name='webform']"));
		int size=checkbox.size();
		System.out.println(size);

		for(int i=0; i<size; i++) {		
			if(checkbox.get(i).getAttribute("value").contains("checkbox3")) {
				System.out.println("Inside loop");
				
				checkbox.get(i).click();
				System.out.println("Clicked Checkbox");
				break;
			}	
		}
		
		driver.close();
	}
}
