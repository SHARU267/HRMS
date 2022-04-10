package kumar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
public class TC_Dropdown 
{
 
public static void main(String[] args) throws InterruptedException 
{
	
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium-JAR\\chrome Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/index.php");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	System.out.println("Login completed");
	driver.switchTo().frame("rightMenu");
	Select st=new Select(driver.findElement(By.name("loc_code")));
	//st.selectByVisibleText("Emp. ID");
	st.selectByIndex(1);
	//st.selectByValue("0");
	Thread.sleep(4000);
	driver.findElement(By.name("loc_name")).sendKeys("1465");
	driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[2]/input[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr/td[1]/input")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@value='Delete']")).click();
	Thread.sleep(4000); 
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout completed");
	Thread.sleep(4000);
	driver.close();
}
}
