package MavenProject1.MavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alert {
	public static void main(String[] args) throws InterruptedException {  

	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Drishya\\Selenium\\chromedriver.exe");  
		
		WebDriver driver = new ChromeDriver(); 

		String text= "Drishya";
		

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		
		driver.findElement(By.id("name")).sendKeys(text);
		
		
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().dismiss();

		driver.close();
	}

}
