import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TableHandle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		driver.manage().window().maximize();
		driver.findElement(By.id("ContentHolder_lbSelectionMode_I")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ContentHolder_lbSelectionMode_DDD_L_LBI1T0")).click();
		Thread.sleep(5000);
		
		Actions builder = new Actions(driver);
		
		WebElement select = driver.findElement(By.id("ContentHolder_lbFeatures_LBT"));
		List<WebElement> options = select.findElements(By.tagName("td"));
		System.out.println(options.size());
		
		builder.keyDown(Keys.CONTROL).click(options.get(3)).click(options.get(5)).click(options.get(7)).build().perform();
		WebElement Table = driver.findElement(By.id("ContentHolder_lbModels_LBT"));
		
		List <WebElement> TableRow = Table.findElements(By.tagName("tr"));
		
		int counter = TableRow.size();
		
		for (int i=0;i<counter;i++)
			{	
				System.out.println("RowNUmber" + (i+1) );
				List <WebElement> TableColumn = TableRow.get(i).findElements(By.tagName("td"));
				System.out.println("Column Size : "+ TableColumn.size());
				
				for (int k=0;k<TableColumn.size();k++)
				{
					System.out.println(TableColumn.get(k).getText().toString());
				}
			}
		//driver.close();
		
	}

}
