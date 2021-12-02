package MavenProject1.MavenProject;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
  
public class SecondScript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Drishya\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		String title=driver.getTitle();
		System.out.println(title);
		String url = "https://rahulshettyacademy.com"; 
		
		driver.get(url); 
		
		String title1 = driver.getTitle(); 
		
		int titleLength = driver.getTitle().length();
		
		System.out.println("Title of the page is : " + title1); 
		System.out.println("Length of the title is : "+ titleLength); 
		
		String actualUrl = driver.getCurrentUrl();
		
		if (actualUrl.equals("https://rahulshettyacademy.com/#/index")){ 
			System.out.println("Verification Successful - The correct Url is opened.");
		}
		else {
			System.out.println("Verification Failed - An incorrect Url is opened.");  
			System.out.println("Actual URL is : " + actualUrl); 
			System.out.println("Expected URL is : " + url);
		}
		
		String pageSource = driver.getPageSource();
		int pageSourceLength = pageSource.length(); 
		System.out.println("Total length of the Page Source is : " + pageSourceLength); 
		 
		driver.close();
		
	}

}
