package kumar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class TC_JavaScrit {

	public static void main(String[] args) throws InterruptedException
	{
		
    System.setProperty("webdriver.chrome.driver","E:\\\\Selenium-JAR\\\\chrome Driver\\\\chromedriver_win32\\\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://183.82.103.245/nareshit/index.php");
    driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("admin");
    driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
    //login using java script executer to click on login button
    WebElement loginbtn=driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[4]/td[1]/input"));
    JavascriptExecutor executor=(JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", loginbtn);
    System.out.println("Login completed");
    //logout using java script executor to click on logout
    WebElement logoutbtn=driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[3]/a"));
    JavascriptExecutor executor1=(JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();",logoutbtn);
    Thread.sleep(4000);
    System.out.println("Logout completed");
    driver.close();
	}

}
