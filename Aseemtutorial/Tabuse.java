
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tabuse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
			ArrayList <String> tabs = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(tabs.get(0));
			driver.get("https://www.facebook.com");
			
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "n");
			ArrayList <String> tabs1 = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(tabs1.get(1));
			driver.get("https://www.bing.com");
			
			String root = driver.switchTo().window(tabs1.get(0)).getTitle();
			System.out.println(root);
			
			
	}

}
