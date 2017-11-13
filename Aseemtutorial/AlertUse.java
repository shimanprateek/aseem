import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertUse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("file:///C:/Users/shima/Desktop/Aseem%20Selenium/Test.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='selectTable']/tbody/tr[2]/td/button")).click();
		
		//driver.findElement(By.id("selectTable")).click();
		
		Alert  simpleAlert = driver.switchTo().alert();
		String alertText = simpleAlert.getText();
		Thread.sleep(3000);
		System.out.println("Alert Text is: " + alertText);
		simpleAlert.accept();
		

	}

}
