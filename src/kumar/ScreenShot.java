package kumar;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium-JAR\\chrome Driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       try
       {
        driver.get("http://183.82.103.245/nareshit/login.php");
        driver.findElement(By.name("txtUserName")).sendKeys("admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin");
        driver.findElement(By.name("Submit")).click();
        System.out.println("Login completed");
        Thread.sleep(4000);
                driver.switchTo().frame("rightMenu");
        driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
        driver.findElement(By.name("txtEmpLastName")).sendKeys("Ashok");
        driver.findElement(By.name("txtEmpFirstName")).sendKeys("Nimmatota");
        driver.findElement(By.xpath("")).click();
        System.out.println("Emp added");
        Thread.sleep(4000);
       }
       catch(Exception e) {
    	   File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	   FileUtils.copyFile(f1, new File("D:\\Ashok123.png"));
       }
       driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[3]/a")).click();
        Thread.sleep(4000);
        driver.close();
        System.out.println("logout completed");
        
	}

}
