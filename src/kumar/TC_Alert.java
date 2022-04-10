package kumar;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
public class TC_Alert {

	public static void main(String[] args) throws Exception
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium-JAR\\chrome Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://adactinhotelapp.com/");
	driver.findElement(By.name("username")).sendKeys("SHARADA267");
	driver.findElement(By.name("password")).sendKeys("YXZ62P");
	driver.findElement(By.name("login")).click();
	System.out.println("Login completed");
	Thread.sleep(5000);
	driver.findElement(By.linkText("Booked Itinerary")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("cancelall")).click();
	Thread.sleep(3000);
	Alert a=driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	System.out.println("Logout completed");
	driver.close();

	
	
	
	
	}

}
