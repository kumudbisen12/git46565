import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTML1 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ab\\Desktop\\Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\ab\\Desktop\\Notepd\\HTML1.html");
		WebElement we= driver.findElement(By.id("Uid"));
		we.sendKeys("xyz");
		
		WebElement we1 = driver.findElement(By.id("pid"));
		we1.sendKeys("12345");
		System.out.println("Megha");
		System.out.println("Bisen");
	}

}
