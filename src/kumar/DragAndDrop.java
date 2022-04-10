package kumar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import static org.testng.Assert.assertEquals;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium-JAR\\chrome Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://jqueryui.com/droppable/");
	Thread.sleep(4000);
	//verify the title cond fail stop the execution
	assertEquals(driver.getTitle(),"Droppable | jQuery UI");
	System.out.println("title matched");
	Thread.sleep(4000);
	driver.switchTo().frame(0);
	Actions ac=new Actions(driver);
	
	ac.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"draggable\"]/p")), driver.findElement(By.xpath("//*[@id=\"droppable\"]"))).perform();
System.out.println("drag and drop completed");
driver.switchTo().defaultContent();
driver.close();
}
}