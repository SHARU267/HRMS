package kumar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_00GoogleLinks {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium-JAR\\chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.co.in/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(WebElement we:links)
		{
			System.out.println(we.getText());
			Thread.sleep(5000);
		}
   driver.close();
}
}