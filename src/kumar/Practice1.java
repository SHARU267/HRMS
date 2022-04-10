package kumar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
public class Practice1 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","E:\\Selenium-JAR\\chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
         driver.findElement(By.name("txtUserName")).sendKeys("admin");
         driver.findElement(By.name("txtPassword")).sendKeys("admin");
         driver.findElement(By.name("Submit")).click();
         Thread.sleep(4000);
         System.out.println("login completed");
         driver.switchTo().frame("rightMenu");
         driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
         driver.findElement(By.name("txtEmpLastName")).sendKeys("Ashok");
	     driver.findElement(By.name("txtEmpFirstName")).sendKeys("Nimmatota");
	       WebElement finput=driver.findElement(By.xpath("//*[@id=\"photofile\"]"));
	     finput.sendKeys("C:\\Users\\Ashok\\OneDrive\\Pictures\\photo\\photo.jpg");
	     driver.findElement(By.xpath("//*[@id=\"btnEdit\"]")).click();
	     Thread.sleep(4000);
	     System.out.println("photo uploaded succesfully");
	     driver.switchTo().defaultContent();
	     driver.findElement(By.linkText("Logout")).click();
	     System.out.println("logout completed");
	     driver.close();
	}

}
