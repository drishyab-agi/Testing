package MavenProject1.MavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Example2 {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Drishya\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login.php");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("drishya@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("drishya123");
		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
		//driver.close();
	}
}
	