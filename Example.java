package MavenProject1.MavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Example {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Drishya\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://tsky.in/Recharge/QuickRecharge");

		driver.findElement(By.xpath("//*[@id=\"subscriberId\"]")).sendKeys("9876543219");
		driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys("1000");
		driver.findElement(By.xpath("//*[@id=\"submitRecharge\"]")).click();
		driver.close();
	}
}



