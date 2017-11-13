import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class actionaseem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("http://store.demoqa.com/");
		
		WebElement element = driver.findElement(By.linkText("Product Category"));
		Actions action = new Actions(driver);

		action.moveToElement(element).build().perform();
		driver.findElement(By.linkText("iPads")).click();
		
		

	}

}
