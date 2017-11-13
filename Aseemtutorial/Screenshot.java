import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver12 = new FirefoxDriver();
		driver12.get("https://www.facebook.com/");
		File scrFile = ((TakesScreenshot)driver12).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot in c drive with name "screenshot.png"
           FileUtils.copyFile(scrFile, new File("C:\\\\Users\\shima\\Desktop\\screens.png"));
           driver12.quit();	
	}

}
