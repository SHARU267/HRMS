package kumar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_01Dropdownvalues 
{
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
		Select st=new Select(driver.findElement(By.name("loc_code")));
		List<WebElement> dropval=st.getOptions();
		for(WebElement we:dropval)
		{
			System.out.println(we.getText());
		}
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("logout completed");
		driver.close();

}
}