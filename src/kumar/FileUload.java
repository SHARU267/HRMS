  package kumar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUload {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium-JAR\\chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/index.php");
		Thread.sleep(5000);
	   System.out.println(driver.getTitle());
	   driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		System.out.println("login completed");
		Thread.sleep(3000);
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Ashok");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Nimmatota");
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		//to upload a file into app
		WebElement fileinput=driver.findElement(By.xpath("//*[@id=\"photofile\"]"));
		fileinput.sendKeys("C:\\Users\\Ashok\\OneDrive\\Pictures\\photo");
		Thread.sleep(5000);
		System.out.println("File uploades successfull");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"btnEdit\"]")).click();
		System.out.println("New employee added successfully");
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		driver.close();

	}

}
