import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement login = driver.findElement(By.id("txtUsername"));
		login.sendKeys("admin");
		WebElement Pass = driver.findElement(By.id("txtPassword"));
		Pass.sendKeys("admin");
		WebElement BtnLog = driver.findElement(By.id("btnLogin"));
		//Pass.sendKeys("admin");
		BtnLog.click();
		Thread.sleep(5000);
		WebDriverWait wt = new WebDriverWait(driver,10);
		
		
		WebElement adminlink = driver.findElement(By.id("menu_admin_viewAdminModule"));
		wt.until(ExpectedConditions.visibilityOf(adminlink));
		adminlink.click();
		
		WebElement SearchUserName = driver.findElement(By.id("searchSystemUser_userName"));
		SearchUserName.sendKeys("Admin");
		
		WebElement SearchBtn = driver.findElement(By.id("searchBtn"));
		SearchBtn.click();
		
		Thread.sleep(5000);
		
		List <WebElement> Al = driver.findElements(By.xpath("//table[@id='resultTable']//descendant::tr"));
		System.out.println(Al.size());
		for(int i = 1; i < Al.size();i++)
			
		{
			List <WebElement> tableData =Al.get(i).findElements(By.tagName("td"));
			System.out.println(tableData.size());
			//System.out.println(Al.get(i).findElements(By.tagName("td")));
			for (int j =0 ;j<tableData.size();j++)
			{
				System.out.println(tableData.get(j).getText().toString());
			}
			if (tableData.get(1).getText().contentEquals("Admin") && tableData.get(2).getText().contentEquals("Admin"))
				
			{
				
				System.out.println("Test Case Passed");
			}
			
			else
				
			{
				System.out.println("Test Case Failed");
			}
		}
	}

}
