 package kumar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class TC_KeyboardActions {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium-JAR\\chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://adactinhotelapp.com/index.php");
	driver.findElement(By.name("username")).sendKeys("SHARADA267");
	driver.findElement(By.name("password")).sendKeys("YXZ62P");
	Thread.sleep(5000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	
	System.out.println("TAB key presed");
	Thread.sleep(4000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyPress(KeyEvent.VK_ENTER);
	System.out.println("Enter key pressed");
	Thread.sleep(4000);
	driver.close();
	
	
	}

}
