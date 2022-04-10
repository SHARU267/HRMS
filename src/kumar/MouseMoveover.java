package kumar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;


public class MouseMoveover 
{

static String url="https://opensource-demo.orangehrmlive.com/";
static String un="Admin";
static String pw="admin123";



	
public static void main(String[] args) throws Exception
{
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium-JAR\\chrome Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to(url);
	Thread.sleep(5000);
   System.out.println(driver.getTitle());
	driver.findElement(By.name("txtUsername")).sendKeys(un);
	driver.findElement(By.name("txtPassword")).sendKeys(pw);
	driver.findElement(By.name("Submit")).click();
	System.out.println("login completed");
	Thread.sleep(3000);
	Actions ac=new Actions(driver);
	ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	Thread.sleep(4000);
	System.out.println("mouse over comleted");
        driver.findElement(By.linkText("Add Employee")).click();
        Thread.sleep(4000);
        	driver.findElement(By.name("firstName")).sendKeys("ashok");
        	driver.findElement(By.name("middleName")).sendKeys("kumar");
        	driver.findElement(By.name("lastName")).sendKeys("nimmatota");

        	 driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
        	Thread.sleep(5000);
        //System.out.println("clicked on add employee menu");
        	ac.moveToElement(driver.findElement(By.linkText("Welcome Paul"))).perform();
	ac.moveToElement(driver.findElement(By.linkText("Logout"))).click();
	//driver.findElement(By.linkText("Logout")).click(); 
	
	//driver.findElement(By.linkText("Logout")).();
	

     //System.out.println("logout completed");
	//Thread.sleep(3000);
	driver.close();
	System.out.println("closed");

}

}

