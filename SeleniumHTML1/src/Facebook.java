import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ab\\Desktop\\Testing\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	    WebElement w = driver.findElement (By.name("firstname"));
	    w.sendKeys ("Megha");
	}
	

}
