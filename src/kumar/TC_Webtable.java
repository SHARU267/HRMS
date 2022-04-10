  package kumar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC_Webtable 
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium-JAR\\chrome Driver\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/Ashok/Downloads/WebTable.html");
//get the size of the table
int row=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr")).size();
int col=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[1]/td")).size();
int row_col=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr/td")).size();
System.out.println(row);
System.out.println(col);
System.out.println(row_col);
//get the data from perticular cell
String data=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[2]/td[2]")).getText();
//get the data from total table
System.out.println(data);
for(int i=1;i<=row;i++)
  {
	for(int j=1;j<=col;j++)
 
	{
	System.out.print(driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr["+i+" "+"]/td["+j+" "+"]")).getText());
	}
	System.out.println();
}
Thread.sleep(4000);

driver.close();

}
}
