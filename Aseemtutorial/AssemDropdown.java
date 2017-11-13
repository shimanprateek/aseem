import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AssemDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("http://www.calculator.net/interest-calculator.html");
		
		Select dropdown = new Select(driver.findElement(By.id("ccompound")));
		
		dropdown.selectByVisibleText("continuously");
		dropdown.selectByIndex(3);
		dropdown.selectByValue("weekly");
		
		driver.close();
	

	}

}
