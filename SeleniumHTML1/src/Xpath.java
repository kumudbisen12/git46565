import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ab\\Desktop\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\ab\\Desktop\\Notepd\\HTML2.html");
		WebElement usernamelb = driver.findElement(By.xpath("/html/body/form/div/label"));
		String user = usernamelb.getText();
		System.out.println("The username"+ user);
		WebElement username = driver.findElement(By.xpath("//input[@id= 'uid']"));
		username.sendKeys("Megha");
		String username1 = username.getAttribute("value");
		System.out.println("The username entered in username textbox:" +username1);
		
		WebElement passwordlabel = driver.findElement(By.xpath("//label[@for='Password']/b"));
		String pswrd = passwordlabel.getText();
		System.out.println("password lable is:"+pswrd);
		
		WebElement psw = driver.findElement(By.xpath("//input[@id='pid']"));
		psw.sendKeys("12345");
		String psw1 = psw.getAttribute("value");
		System.out.println("password is:" + psw1);
		
		WebElement browser = driver.findElement(By.xpath("//label [@ for = 'Password']/following-sibling::select"));
		Select sel = new Select (browser);
		sel.selectByValue("ie");
		
		driver.findElement(By.xpath("//button [contains (@type , 'Submit')]")).click();
		//driver.switchTo().alert().accept();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//input[@name='Remember Me']"));
		driver.findElement(By.xpath("//button[contains(text(),'cancel')]")).click();
		driver.findElement(By.partialLinkText("pass"));
		
		String Forgotpassurl = driver.getCurrentUrl();
		System.out.println("forgot paswrd url is:"+ Forgotpassurl);
		driver.navigate().back();
		
		String loginurl = driver.getCurrentUrl();
		System.out.println("user is navigate by on login page:" +loginurl);
		driver.close();
				
		
		
		
		
		
		
		
		
	}

	private static void click() {
		// TODO Auto-generated method stub
		
	}

}
