package kumar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TC001 
{
	static String url="http://183.82.119.60/nareshit/login.php";
	static String un="nareshit";
	static String pw="nareshit";

	
public static void main(String[] args) throws Exception
{
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium-JAR\\chrome Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to(url);
	if(driver.getTitle().equals("hrms"))
			{
		   System.out.println("title matched");
			}
	else
	{
		System.out.println("title not matched");
		
	}
	driver.findElement(By.name("txtUserName")).sendKeys(un);
	driver.findElement(By.name("txtPassword")).sendKeys(pw);
	driver.findElement(By.name("Submit")).click();
	System.out.println("login completed");
	if(driver.getTitle().equals("hrms"))
			{
		System.out.println("title matched");
			}
	else 
	{
		System.out.println("title not matched");
		
	}
	driver.findElement(By.linkText("Logout")).click();
System.out.println("logout completed");
	Thread.sleep(3000);
	driver.close();
	
}
}
