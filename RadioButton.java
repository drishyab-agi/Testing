package MavenProject1.MavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class RadioButton {
	public static void main(String[] args) throws InterruptedException {  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Drishya\\Selenium\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://demo.guru99.com/test/radio.html"); 
		Thread.sleep(3000);

		Assert.assertFalse(driver.findElement(By.id("vfb-7-1")).isSelected());
		
		driver.findElement(By.id("vfb-7-1")).click();
		
		System.out.println(driver.findElement(By.id("vfb-7-1")).isSelected());
		
		Assert.assertTrue(driver.findElement(By.id("vfb-7-1")).isSelected());
		
		driver.close();

	}

}
