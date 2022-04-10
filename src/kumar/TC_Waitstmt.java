package kumar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_Waitstmt {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium-JAR\\chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/index.php");
		
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
		//wait untill login btn need to be loaded
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
		driver.findElement(By.name("Submit")).click();
		//System.out.println("Submit completed");
		//wait untill emp info page to be loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		System.out.println("Login completed");
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(4000);
		System.out.println("Logout completed");
		driver.close();
		
		
		
	}

	
		
	}


