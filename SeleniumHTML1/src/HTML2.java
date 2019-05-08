import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTML2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ab\\Desktop\\Testing\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/ab/Desktop/Notepd/HTML2.html");
	WebElement W = driver.findElement(By.id("uid"));
	W.sendKeys("ghsgjgjk");
	WebElement W1 = driver.findElement(By.name("username"));
	W1.sendKeys("Megha");
	WebElement W2 = driver.findElement(By.className("uname"));
	W2.sendKeys("One");
	WebElement W4 = driver.findElement(By.id("pid"));
	W4.sendKeys("vhgjjkhj");
    WebElement W5= driver.findElement(By.name("Browser"));
    W5.sendKeys("ie");
    WebElement W6 = driver.findElement(By.xpath("// input [@type ='checkbox']" ));
    String s=W6.getText();
    System.out.println(s);
    
	
			
	
}
}
