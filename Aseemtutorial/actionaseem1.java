import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class actionaseem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("http://www.theautomatedtester.co.uk/demo2.html");
		
		WebElement element = driver.findElement(By.xpath("/html/body/div[1]"));
		WebElement otherelement = driver.findElement(By.name("droppable"));
		Actions action = new Actions(driver);
		
		action.clickAndHold(element)
		.moveToElement(otherelement)
		.release(otherelement)
		.build().perform();
		//driver.findElement(By.linkText("iPads")).click();
	}

}
