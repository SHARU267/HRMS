package kumar;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice2 
{
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","E:\\Selenium-JAR\\chrome Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
     driver.findElement(By.name("txtUserName")).sendKeys("admin");
     driver.findElement(By.name("txtPassword")).sendKeys("admin");
     driver.findElement(By.name("Submit")).click();
     Thread.sleep(4000);
     System.out.println("login completed");
     Actions ac=new Actions(driver);
     ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
     driver.findElement(By.name("txtEmpLastName")).sendKeys("Ashok");
     driver.findElement(By.name("txtEmpFirstName")).sendKeys("Nimmatota");
     driver.findElement(By.xpath("//*[@id=\"btnEdit\"]")).click();
     driver.findElement(By.linkText("Logout")).click();
     System.out.println("logout completed");
     driver.close();
}
}