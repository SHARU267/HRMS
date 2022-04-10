package kumar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//http://127.0.0.1/orangehrm-2.6/login.php
public class Frames 
{
public static void main(String[] args) throws InterruptedException, IOException 
{
	
	System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium-JAR\\\\chrome Driver\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/index.php");
	driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
	System.out.println("login completed");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(5000);
	//Actions ac=new Actions(driver);
	//ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	try
	{
  driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
	driver.findElement(By.name("txtEmpLastName")).sendKeys("Ashok");
	driver.findElement(By.name("")).sendKeys("Nimmatota");
	
	driver.findElement(By.xpath("//*[@id=\"btnEdit\"]")).click();
	//driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
	System.out.println("save button");
	Thread.sleep(5000);
	}
	catch(Exception e)
	{
		File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File("E:\\sharuk.jpg"));
	}
  //driver.findElement(By.name("btnView")).click();
	//System.out.println("saved details");
	driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
System.out.println("log out completed");
driver.close();
	
	System.out.println("application closed");
	

}
}
