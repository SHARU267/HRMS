package kumar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_001MulCheckBox {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\Selenium-JAR\\chrome Driver\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.navigate().to("http://183.82.103.245/nareshit/index.php");
      driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
      driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
      driver.findElement(By.name("Submit")).click();
      Thread.sleep(4000);
      System.out.println("login completed");
      driver.switchTo().frame("rightMenu");
      for(int i=1;i<=5;i=i+2)
      {
      driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr["+i +"]/td[1]/input")).click();
      System.out.println("clicked on"+i);
	}
      driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[2]")).click();
      driver.switchTo().defaultContent();
      driver.findElement(By.linkText("Logout")).click();
      System.out.println("logout completed");
      driver.close();
	}
}
