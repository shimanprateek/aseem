import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailAttach {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin?sacu=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en&service=mail#identifier");
		driver.manage().window().maximize();
		if(driver.findElement(By.id("glifPromo")).isDisplayed())
		{
			driver.findElement(By.id("McfNlf")).click();
			driver.findElement(By.id("identifierId")).sendKeys("shiman.prateek@gmail.com");
			driver.findElement(By.xpath("//span[starts-with(@class,'RveJvd') and contains(text(),'Next')]")).click();
			//driver.findElement(By.xpath("//*[@id='password']/descendant::input[contains(@name,'password')]")).sendKeys("G421896p");
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("G421896p");
			driver.findElement(By.xpath("//span[starts-with(@class,'RveJvd') and contains(text(),'Next')]")).click();
			Thread.sleep(6000);
			WebElement we = driver.findElement(By.xpath("//div[@class='z0']/div[contains(text(),'COMPOSE')]"));
			
			WebDriverWait wt = new WebDriverWait(driver, 10) ;
			wt.until(ExpectedConditions.visibilityOf(we));
			boolean x = we.isDisplayed();
			System.out.println(x);
			we.click();
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//table[@class='GS']/descendant::input")).sendKeys("shiman.prateek1@gmail.com");
			driver.findElement(By.xpath("//table[@class='GS']/descendant::input[contains(@class,'wA')]//following-sibling::textarea[@aria-label ='To']")).sendKeys("shiman.prateek1@gmail.com");
			driver.findElement(By.xpath("//div[contains(@command,'Files')]//div[contains(@class,'aaA')]")).click();
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_C);
			
			r.keyRelease(KeyEvent.VK_C);
			
		} else
		{
			driver.findElement(By.id("identifierId")).sendKeys("shiman.prateek@gmail.com");
			driver.findElement(By.xpath("//span[starts-with(@class,'RveJvd') and contains(text(),'Next')]")).click();
			driver.findElement(By.xpath("//span[starts-with(@class,'whsOnd') and contains(@type,'password')]")).click();
			
			Thread.sleep(500);
			//driver.findElement(By.x

		}
	}
}


