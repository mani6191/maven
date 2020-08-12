package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstant
{

	public WebDriver driver;
	@BeforeClass
	public void openBrowser() 
	{
		System.setProperty(chrome_key, chrome_value);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(URL);
		
	}
	@BeforeMethod
	public void execusion()
	{
		Reporter.log("Execusion started", true);
	}
	@AfterClass
	public void closeBrowser()
	{
		/*driver.close();*/
	}

}
