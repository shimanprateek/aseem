import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class payflex {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www-fqa3.payflex.com/");
			driver.manage().window().maximize();
			WebElement SignIn = driver.findElement(By.id("SingInNavigation"));
			SignIn.click();
			
			WebElement check = driver.findElement(By.cssSelector("span#signInHeader"));
			if (check.isDisplayed() || driver.getTitle().contentEquals("Login | PayFlex"))				
			{
				WebElement UserName = driver.findElement(By.cssSelector("input[id='signInUserName']"));
				UserName.sendKeys("lisamona12");
				WebElement Password =	driver.findElement(By.id("signInPassword"));
				Password.sendKeys("test1234");	
				WebElement btnSignIn = driver.findElement(By.cssSelector("input[type='submit']"));
				btnSignIn.submit();
				Thread.sleep(20000);;
				if(driver.getTitle().contentEquals("Dashboard | PayFlex"))
				{	
					driver.manage().window().maximize();
					//List <WebElement> other = driver.findElements(By.xpath("//span[starts-with(@class,'hcareFsaname') and contains(text(),'UEX')]"));
					//List <WebElement> other = driver.findElements(By.xpath("//span[starts-with(@class,'hcareFsaname') and contains(text(),'UEX')]/../../preceding-sibling::div//a[starts-with(@href,'/Accounts') and contains(text(),'Health Savings Account')]"));
					List <WebElement> other = driver.findElements(By.xpath("//span[starts-with(@class,'hcareFsaname') and contains(text(),'UEX')]/../../preceding-sibling::div//a[starts-with(@href,'/Accounts') and contains(text(),'Healthcare (FSA)')]"));
					//span[starts-with(@class,'hcareFsaname') and contains(text(),'UEX')]/../../preceding-sibling:://a[starts-with(@href,'/Accounts') and contains(text(),'Health Savings Account')]
					List <WebElement> Link = driver.findElements(By.xpath("//a[starts-with(@href,'/Accounts') and contains(text(),'Health Savings Account')]"));
					//List <WebElement> Link = driver.findElements(By.xpath("//a[starts-with(@href,'/Accounts') and contains(text(),'Limited HRA']"));
					WebDriverWait wait = new WebDriverWait(driver,10);

					wait.until(ExpectedConditions.visibilityOfAllElements(Link));
					System.out.println(Link.size());
					System.out.println(other.size());
					
					for(WebElement e :other)
					{
						//e.click();
						JavascriptExecutor js =(JavascriptExecutor)driver;
						js.executeScript("window.scrollTo(0,"+e.getLocation().x+")");

						//e.isEnabled();
						//e.isSelected();
						//e.click();
						Actions action = new Actions(driver);
						//action.doubleClick(e).build().perform();
						action.moveToElement(e).build().perform();
						Thread.sleep(1000);
						action.click(e).build().perform();
						//action.moveToElement(e).click().build().perform();
					}
					
					if(driver.getTitle().contentEquals("Health Savings Account detail | PayFlex"))
					{
						System.out.println("TestCase Passed ");
					}else
					{
						System.out.println("TestCase failed ");
					}
					
				}
				else
				{
					System.out.println("Some Problem with UserName/Password");
				}
				
			}
			
			driver.close();
			//System.out.println(driver.getTitle().toString());
			
	}

}
