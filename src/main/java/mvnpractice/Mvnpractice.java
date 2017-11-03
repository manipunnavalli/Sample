package mvnpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import com.thoughtworks.selenium.Selenium;
@Listeners(mvnpractice.Listenerspractice.class)
public class Mvnpractice {
	public static WebDriver driver; 
	String appURL = "http://google.com";
 
	@BeforeClass
	public void testSetUp() {
		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		P1.m1("google login");
		//driver.get("https://accounts.google.com//ServiceLogin");
	}
	
	@Test(priority=0)
	public void launchgmail() {
		driver.navigate().to(appURL);
		String getTitle = driver.getTitle();
		Assert.assertEquals(getTitle, "Google");
	}
	@Test(priority=1)
	public void signin(){
		driver.findElement(By.xpath("//*[@id='gb_70']")).submit();
		String title=driver.getTitle();
		Assert.assertEquals(title,"Sign in - Google Accounts");
	}
	
	@AfterClass
	public void tearDown() {
		//Class<AssertionFailedError> x=AssertionFailedError.class;
	/*	String x="hi";
		String getTitle1 = driver.getTitle();
		Assert.assertEquals(actual, expected);
	selenium.setSpeed("2000");*/
		driver.quit();
	}
	


}
