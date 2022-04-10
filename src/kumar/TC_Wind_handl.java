package kumar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

import org.openqa.selenium.By;
public class TC_Wind_handl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium-JAR\\chrome Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	Thread.sleep(4000);
System.out.println("first window");
	driver.findElement(By.id("btn2")).click();
	System.out.println("second window");
	Thread.sleep(40000);
	driver.findElement(By.id("btn3")).click();
	ArrayList<String> windinfo=new ArrayList<String>(driver.getWindowHandles());

	driver.switchTo().window(windinfo.get(0));
	
Thread.sleep(4000);	
System.out.println("third window");
	Thread.sleep(4000);
	//driver.close();
	driver.quit();
	}

}
